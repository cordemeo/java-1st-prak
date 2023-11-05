import java.util.*; //декуиуи

public class Puanitsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            player1.addLast(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            player2.addLast(scanner.nextInt());
        }
        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int card1 = player1.pollFirst();
            int card2 = player2.pollFirst();
            if (card1 == 0 && card2 == 9) {
                player1.addLast(card1);
                player1.addLast(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2.addLast(card1);
                player2.addLast(card2);
            } else if (card1 > card2) {
                player1.addLast(card1);
                player1.addLast(card2);
            } else {
                player2.addLast(card1);
                player2.addLast(card2);
            }
            moves++;
        }
        if (moves == 106) {
            System.out.println("botva");
        } else if (player2.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("second " + moves);
        }
    }
}
