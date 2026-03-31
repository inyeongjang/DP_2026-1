package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA; // Triple 객체 3개가 만들어짐 

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name); // valueOf 메소드 이용 : 상수 이름 주면 해당 객체 Return 
    }
}
