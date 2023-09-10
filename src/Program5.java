class Ror {
    public static int Factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
public class Program5 {
    public static void main(String args[]) {
        /*
        Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода.
         */
        Ror obj = new Ror();
        int result = obj.Factorial(2);
        System.out.println(result);

    }
}




