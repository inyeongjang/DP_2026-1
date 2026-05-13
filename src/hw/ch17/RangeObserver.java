package hw.ch17;

public class RangeObserver implements Observer{
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        if (number < 10) {
            System.out.print("RangeObserver: [Low] ");
            System.out.println(number);
        }
        else if (number < 20) {
            System.out.print("RangeObserver: [Mid] ");
            System.out.println(number);
        }
        else {
            System.out.print("RangeObserver: [High] ");
            System.out.println(number);
        }
    }
}
