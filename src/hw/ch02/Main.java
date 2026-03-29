package hw.ch02;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n학번 : 20230918, 이름 : 장인영\n");

        // 1. 한국 콘센트 생성
        KoreanOutlet outlet = new KoreanOutlet();

        // 2. Adapter 생성 (콘센트를 Charger로 변환)
        Charger adapter = new KoreanOutletAdapter(outlet);

        // 3. Smartphone에 전달 
        Smartphone phone = new Smartphone(adapter);

        // 4. charge() 호출
        phone.charge();
    }
}