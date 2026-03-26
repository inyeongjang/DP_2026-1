package ch04.A2.idcard;


import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100; // 기본 데이터 타입 
    private final Map<Integer, String> database = new HashMap<>(); // 정수 객체 

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
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
