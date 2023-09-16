import java.util.Scanner;
public class Program2 {
    public static void main(String args[]) {
         /*
      Написать программу, в результате которой массив чисел вводится
пользователем с клавиатуры считается сумма элементов целочисленного
массива с помощью циклов do while, while, также необходимо найти
максимальный и минимальный элемент в массиве, результат выводится на
экраN
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        if (size <= 0) {
            System.out.println("Введите положительное число");
        }
        else{
                int array[] = new int[size];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size; i++) {
                    array[i] = input.nextInt();
                }
                int sum = 0;
                int max = array[0];
                int min = array[0];
                int cnt = 0;
                while (cnt < size) {
                    sum = sum + array[cnt];
                    if (array[cnt] > max) {
                        max = array[cnt];

                    }
                    if (array[cnt] < min) {
                        min = array[cnt];

                    }

                    cnt += 1;

                }
                System.out.printf("sum = %d, min = %d, max = %d", sum, min, max);


                System.out.println();


            }
        }
    }

