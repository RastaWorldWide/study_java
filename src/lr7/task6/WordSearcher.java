package lr7.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearcher {
    public static void main(String[] args) {
        BufferedReader reader = null;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите путь к файлу: ");
            String fileName = scanner.nextLine();

            System.out.print("Введите слово для поиска: ");
            String word = scanner.nextLine();

            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла: " + e.getMessage());
            }
        }
    }
}
