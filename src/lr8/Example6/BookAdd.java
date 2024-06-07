package lr8.Example6;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BookAdd {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr8/Example6/book.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите название автора: ");
            String author = scanner.nextLine();

            System.out.print("Введите год выпуска книги: ");
            String year = scanner.nextLine();

            System.out.print("Введите название книги: ");
            String name = scanner.nextLine();

            JSONObject newBook = new JSONObject();
            newBook.put("author", author);
            newBook.put("year", year);
            newBook.put("name", name);
            jsonArray.add(newBook);

            JSONObject library = new JSONObject();
            library.put("books", jsonArray);

            try (FileWriter file = new FileWriter("src/lr8/Example6/book.json")) {
                file.write(library.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
