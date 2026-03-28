package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    // 반복 횟수를 인자로 받는 생성자 추가
    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount);
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
