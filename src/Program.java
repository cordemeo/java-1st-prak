public class Program{
    public static void main (String args[]) {
        /*
        Написать программу, в результате которой массив чисел создается с
        помощью инициализации (как в Си) вводится и считается в цикле сумма
        элементов целочисленного массива, а также среднее арифметическое его
        элементов результат выводится на экран. Использовать цикл for
         */
        int[] nums = new int[]{1, 2, 3, 4, 5,31,7};
        int sum = 0;
        //цикл для подссчета суммыв элеименов
        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

        }
        int a=  sum / nums.length; // надо не приводить к целому ntcnjj
        System.out.printf("Сумма: %d Среднее: %d \n", sum,a);
    }
}