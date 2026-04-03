package hw.ch05;

public enum LoggerEnum {
    INSTANCE; // 클래스 로드 시 LoggerEnum 객체를 하나 만들어 둠
 
    private StringBuilder logBuffer;
    
    private LoggerEnum() {
        System.out.println("[LoggerEnum] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }
 
    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
        .append(message).append("\n");
        System.out.println("[LoggerEnum] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}