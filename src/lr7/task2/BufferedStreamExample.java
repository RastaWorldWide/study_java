package lr7.task2;

import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) {
        String filename = "src/lr7/task2/example_file.txt";
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Введите данные для записи в файл: ");
            String data = consoleReader.readLine();
            writer.write(data);
            System.out.println("Данные записаны в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
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
