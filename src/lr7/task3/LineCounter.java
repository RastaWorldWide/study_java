package lr7.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public static void main(String[] args) {
        try {
            File file = new File("src/lr7/task3/file");
            FileReader fileReader = new FileReader(file);
            var bufferedReader = new BufferedReader(fileReader);
            int counter = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                counter++;
            }

            System.out.println("Количество строк в файле: " + counter);
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
