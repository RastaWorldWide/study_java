package lr7.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamExample {
    public static void main(String[] args) {
        String filename = "src/lr7/task12/example_file.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для записи в файл: ");
        String data = scanner.nextLine();
        scanner.close();
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        try (FileReader reader = new FileReader(filename)) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        if (new File(filename).delete()) {
            System.out.println("Файл удален: " + filename);
        } else {
            System.out.println("Не удалось удалить файл: " + filename);
        }
    }
}
