import java.util.Scanner; //12

public class Main11 {
    public static void main(String[] args) {
        readNumbers();
    }

    public static void readNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}