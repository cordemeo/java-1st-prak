import java.util.Scanner;
import java.util.Stack;

public class StackPuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем стеки для карт первого и второго игроков
        Stack<Integer> firstPlayerCards = new Stack<>();
        Stack<Integer> secondPlayerCards = new Stack<>();

        // Считываем карты первого игрока
        for (int i = 0; i < 5; i++) {
            firstPlayerCards.push(scanner.nextInt());
        }

        // Считываем карты второго игрока
        for (int i = 0; i < 5; i++) {
            secondPlayerCards.push(scanner.nextInt());
        }

        int moves = 0; // Количество ходов

        // Игра продолжается, пока у обоих игроков есть карты
        while (!firstPlayerCards.empty() && !secondPlayerCards.empty()) {
            int firstPlayerCard = firstPlayerCards.pop(); // Карта первого игрока
            int secondPlayerCard = secondPlayerCards.pop(); // Карта второго игрока

            // Если карта первого игрока больше карты второго игрока
            if (firstPlayerCard > secondPlayerCard || (firstPlayerCard == 0 && secondPlayerCard == 9)) {
                firstPlayerCards.add(0, firstPlayerCard); // Кладем карты под низ колоды первого игрока
                firstPlayerCards.add(0, secondPlayerCard);
            }
            // Если карта второго игрока больше карты первого игрока
            else if (secondPlayerCard > firstPlayerCard || (secondPlayerCard == 0 && firstPlayerCard == 9)) {
                secondPlayerCards.add(0, secondPlayerCard); // Кладем карты под низ колоды второго игрока
                secondPlayerCards.add(0, firstPlayerCard);
            }

            moves++; // Увеличиваем количество ходов

            // Если количество ходов достигло 106, объявляем ничью
            if (moves == 106) {
                System.out.println("botva");
                return;
            }
        }

        // Если у первого игрока закончились карты, он проиграл
        if (firstPlayerCards.empty()) {
            System.out.println("second " + moves);
        }
        // Если у второго игрока закончились карты, он проиграл
        else if (secondPlayerCards.empty()) {
            System.out.println("first " + moves);
        }
    }
}