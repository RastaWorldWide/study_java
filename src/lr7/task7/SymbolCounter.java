package lr7.task7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SymbolCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String fileName = scanner.nextLine();
        System.out.print("Введите текст для записи в файл: ");
        String textToWrite = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(textToWrite);
            writer.close();
            int numOfSymbols = textToWrite.length();
            System.out.println("Количество записанных символов: " + numOfSymbols);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл " + e.getMessage());
        }
    }
}
