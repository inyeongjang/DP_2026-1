package hw.ch10;

public class CyclicStrategy implements Strategy { 
    private int handValue = 0;

    @Override
    public Hand nextHand() {
        return Hand.getHand(handValue++ % 3);
    }

    @Override
    public void study(boolean win) {
    }
}
