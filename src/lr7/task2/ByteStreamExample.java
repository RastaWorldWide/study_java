package lr7.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamExample {
    public static void main(String[] args) {
        String filename = "src/lr7/task2/example_file.txt";
        System.out.println("Введите данные для записи в файл:");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        try (FileInputStream inputStream = new FileInputStream(filename)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
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
