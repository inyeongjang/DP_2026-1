package hw.ch10;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n학번 : 20230918, 이름 : 장인영");
        
        System.out.println("\n===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));

        System.out.println("\n===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());

        // CyclicStrategy 테스트: 순환 확인
        System.out.println("\n===== CyclicStrategy 의 손가락 순환 =====\n");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 10; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i+1) + "번째: " + hand);
            cyclic.study(false); // study 호출해도 영향 없음
        }

        // 게임 진행 코드 : player1과 player2 10번 게임 진행 
        System.out.println("\n===== 게임 진행 =====\n");
        for (int i = 0; i < 10; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();

            }
        }
        System.out.println("\n===== Total result =====\n");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}