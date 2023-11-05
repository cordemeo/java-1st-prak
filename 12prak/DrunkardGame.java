import java.util.*; //тут куиуи

public class DrunkardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите карты первого игрока: ");
        String player1Cards = scanner.nextLine();

        System.out.print("Введите карты второго игрока: ");
        String player2Cards = scanner.nextLine();

        Queue<Integer> player1Deck = new LinkedList<>();
        Queue<Integer> player2Deck = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            player1Deck.add(Character.getNumericValue(player1Cards.charAt(i)));
            player2Deck.add(Character.getNumericValue(player2Cards.charAt(i)));
        }

        int moves = 0;
        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && moves < 106) {
            int card1 = player1Deck.poll();
            int card2 = player2Deck.poll();

            if (card1 > card2) {
                player1Deck.add(card1);
                player1Deck.add(card2);
            } else if (card2 > card1) {
                player2Deck.add(card2);
                player2Deck.add(card1);
            } else {
                player1Deck.add(card1);
                player2Deck.add(card2);
            }

            moves++;
        }

        if (moves >= 106) {
            System.out.println("botva");
        } else if (player1Deck.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}
