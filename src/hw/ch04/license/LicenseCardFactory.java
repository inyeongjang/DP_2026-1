package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

import java.util.LinkedHashMap;
import java.util.Map;

public class LicenseCardFactory extends Factory {
    // 필드 추가 
    private int licenseNumber = 100; // 면허 번호 카운터 (100부터 시작)
    private String baseDate;         // 발급 기준 날짜 
    private final Map<Integer, String> database = new LinkedHashMap<>();

    // LicenseCardFactory 생성자에 baseDate 추가
    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    // LicenseCard 생성 (licenseCounter 자동 증가)
    @Override
    protected synchronized Product createProduct(String owner) {
        return new LicenseCard(owner, licenseNumber++, baseDate, "2030-12-31");
    }

    // 등록 메시지 출력 
    @Override
    protected void registerProduct(Product product) {
        LicenseCard card = (LicenseCard) product;
        database.put(card.getLicenseNumber(), card.getHolder());
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getDatabase() {
        return new LinkedHashMap<>(database);
    }
}