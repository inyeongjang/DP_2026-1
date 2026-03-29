package hw.ch02;

// Charger 인터페이스를 사용하는 스마트폰 클래스 

public class Smartphone {
    private Charger charger;

    public Smartphone(Charger charger) {
        this.charger = charger;
    }

    public void charge() {
        int voltage = charger.charge();
        System.out.println("스마트폰이 " + voltage + "V 에서 충전합니다.");
    }
}
