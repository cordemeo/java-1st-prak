public class Program3 {
    /*
    Написать программу, в результате которой выводятся на экран
аргументы командной строки в цикле for.
     */
    public static void main(String args[]){
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++){
                System.out.println(args[i]);
            }

        }
    }
}
