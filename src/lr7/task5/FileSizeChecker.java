package lr7.task5;

import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        System.out.println("Размер файла в байтах: " + file.length());
    }
}
