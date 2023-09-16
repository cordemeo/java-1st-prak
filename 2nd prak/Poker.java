import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {

        int cardsPerPlayer = 5;
        int players =0 ;

        String[] suits = {
                "Пик", "Бубен", "Черв", "Треф"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"
        };

        int n = suits.length * rank.length;


        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

            if(sc.hasNextInt()){

                players = sc.nextInt();
                if(cardsPerPlayer * players <= n){
                    break;
                } else {
                    if (players ==0){

                        System.out.println("Игра окончена..");
                        break;

                    } else if (players<0){

                        System.out.println("Ошибка! Введите положительное число.");

                    } else{

                        System.out.println("Ошибка! Введите меньшее число.");
                    }
                }

            } else{
                System.out.println("Ошибка! Введите допустимое число.");

            }
        }


        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }
    }

}
