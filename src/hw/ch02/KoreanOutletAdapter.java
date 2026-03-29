package hw.ch02;

public class KoreanOutletAdapter implements Charger {
    
    // KoreanOutlet을 내부적으로 포함 
    private KoreanOutlet outlet;

    public KoreanOutletAdapter(KoreanOutlet outlet) {
        this.outlet = outlet;
    }

    // Charger 인터페이스 구현 
    @Override
    // KoreanOutlet의 provide()를 charge()로 변환
    public int charge() {
        // 220V를 그대로 반환 
        return outlet.provide();
    }
}