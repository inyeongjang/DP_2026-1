package practice.ch06;

public class Main {
    public static void main(String[] args) {
        MessageBox mbox1 = new MessageBox('*');
        mbox1.use("Hello, world."); 

        mbox1.createCopy().use("Hello, world.");  // 복제 
        // mbox1.clone(); // 이렇게는 할 수 없음. clone() 메소드는 자신의 클래스에서만 호출 가능 
        
    }   
}
