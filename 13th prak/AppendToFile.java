import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для добавления в файл:");
        String text = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("file.txt", true);
            writer.write(text);
            writer.close();
            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}