package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

import java.util.LinkedHashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private final Map<Integer, String> database = new LinkedHashMap<>();
    
    // 발급 날짜를 추가하기 위해 baseDate 필드 추가
    private String baseDate;

    // IDCardFactory 생성자에 baseDate 추가
    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    // baseDate를 사용하여 발급 날짜 설정 
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getDatabase() {
        return new LinkedHashMap<>(database);
    }
}