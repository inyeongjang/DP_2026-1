package practice.ch03;

public class Main {
    public static void main(String[] args) {
        // AbstractDisplay 타입으로 선언할 수 있다. 
        AbstractDisplay d1 = new CharDisplay('H');
        // CharDisplay d1 = new CharDisplay('H');
        d1.display();
        d1.open();

        // StringDisplay d2 = new StringDisplay(" Hello, world. ");
        // AbstractDisplay 타입으로 선언할 수 있다. 
        AbstractDisplay d2 = new StringDisplay(" Hello, world. ");
        d2.display();

        // 추상 클래스는 인스턴스를 만들 수 없다. 
        // AbstractDisplay d3 = new AbstractDisplay(" 안녕하세요. ");
    }
}
