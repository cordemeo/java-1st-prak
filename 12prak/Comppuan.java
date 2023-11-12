import java.util.*;

public class Comppuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] player1 = new int[5];
        int[] player2 = new int[5];
        for (int i = 0; i < 5; i++) {
            player1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            player2[i] = scanner.nextInt();
        }
        int moves = 0;
        while (moves < 106 && player1.length > 0 && player2.length > 0) {
            int card1 = player1[0];
            int card2 = player2[0];
            if (card1 == 0 && card2 == 9) {
                int[] temp = new int[player1.length + 1];
                System.arraycopy(player1, 1, temp, 0, player1.length - 1);
                temp[player1.length - 1] = card1;
                temp[player1.length] = card2;
                player1 = temp;
                player2 = Arrays.copyOfRange(player2, 1, player2.length);
            } else if (card1 == 9 && card2 == 0) {
                int[] temp = new int[player2.length + 1];
                System.arraycopy(player2, 1, temp, 0, player2.length - 1);
                temp[player2.length - 1] = card2;
                temp[player2.length] = card1;
                player2 = temp;
                player1 = Arrays.copyOfRange(player1, 1, player1.length);
            } else if (card1 > card2) {
                int[] temp = new int[player1.length + 2];
                System.arraycopy(player1, 1, temp, 0, player1.length - 1);
                temp[player1.length - 1] = card1;
                temp[player1.length] = card2;
                player1 = temp;
                player2 = Arrays.copyOfRange(player2, 1, player2.length);
            } else if (card2 > card1) {
                int[] temp = new int[player2.length + 2];
                System.arraycopy(player2, 1, temp, 0, player2.length - 1);
                temp[player2.length - 1] = card2;
                temp[player2.length] = card1;
                player2 = temp;
                player1 = Arrays.copyOfRange(player1, 1, player1.length);
            }
            moves++;
        }
        if (moves == 106) {
            System.out.println("botva");
        } else if (player1.length == 0) {
            System.out.println("second " + moves);
        } else if (player2.length == 0) {
            System.out.println("first " + moves);
        }
    }
}

