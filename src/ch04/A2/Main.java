package ch04.A2;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();

        System.out.println("등록된 시리얼-오너 목록: " + factory.getDatabase());

        int targetSerial = 100;
        String owner = factory.getDatabase().get(targetSerial);
        if (owner != null) {
            System.out.println("시리얼 " + targetSerial + "의 오너: " + owner);
        } else {
            System.out.println("시리얼 " + targetSerial + "에 해당하는 오너가 없습니다.");
        }
    }
}
