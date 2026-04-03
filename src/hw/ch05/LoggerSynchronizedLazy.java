package hw.ch05;

public class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy instance = null;
 
    private StringBuilder logBuffer;
    
    private LoggerSynchronizedLazy() {
        System.out.println("[LoggerSynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
        slowdown(); // 인스턴스가 생성될 때 시간을 지연시킴 
    }
 
    public static synchronized LoggerSynchronizedLazy getInstance() {
        if (instance == null) { // 처음 호출되는지 검사 
            instance = new LoggerSynchronizedLazy();
        }
        return instance;
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
        .append(message).append("\n");
        System.out.println("[LoggerSynchronizedLazy] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }   

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 1초 쉼 
        } catch (InterruptedException e) {
        }
    }
}
