import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReplaceInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новый текст для записи в файл:");
        String newText = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write(newText);
            writer.close();
            System.out.println("Текст успешно заменен в файле.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}