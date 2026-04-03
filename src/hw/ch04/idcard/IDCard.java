package hw.ch04.idcard;

import hw.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    // 발급 날짜를 추가하기 위해 issuedDate 필드 추가 
    private String issuedDate;

    // IDCard 생성자에 발급 날짜 추가
    IDCard(String owner, int serial, String issuedDate) {
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")] - " + "발급 날짜: " + issuedDate;
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }

    // getter 메서드 추가 
    public String getIssuedDate() {
        return issuedDate;
    }
}
