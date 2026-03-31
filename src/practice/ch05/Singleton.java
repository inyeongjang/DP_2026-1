package practice.ch05;

// 싱글톤 패턴 적용하기 
public class Singleton {

    // (3) Singleton 객체를 미리 하나 만들어 둠 
    private static Singleton singleton = new Singleton();
    
    // (1) 생성자를 private으로 함 
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
    }

    // (2) Singleton 객체를 얻어갈 수 있는 메소드를 정의함 
    public static Singleton getInstance() {
        return singleton;
    }

}
