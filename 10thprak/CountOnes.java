import java.util.Scanner; //11

public class CountOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean foundTwoZeros = false;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number == 1 && !foundTwoZeros) {
                count++;
            } else if (number == 0 && !foundTwoZeros) {
                foundTwoZeros = true;
            } else if (number == 0 && foundTwoZeros) {
                break;
            }
        }

        System.out.println("Число 1 встречается " + count + " раз");
    }
}