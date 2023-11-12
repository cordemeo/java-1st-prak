import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;



public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для записи в файл:");
        String text = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write(text);
            writer.close();
            System.out.println("Текст успешно записан в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
