package lr8.Example6;

import java.io.FileReader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BookSearch {
    public static void findBookByName(String name) {
        try {
            FileReader reader = new FileReader("src/lr8/Example6/book.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject library = (JSONObject) jsonParser.parse(reader);
            JSONArray books = (JSONArray) library.get("books");

            for (int i = 0; i < books.size(); i++) {
                JSONObject book = (JSONObject) books.get(i);
                if (book.get("name").equals(name)) {
                    System.out.println("Книга найдена:");
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год: " + book.get("year"));
                    System.out.println("Книга: " + book.get("name"));
                    return;
                }
            }

            System.out.println("Книга \"" + name + "\" не найдена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя книги, которую хотите найти: ");
        String name = scanner.nextLine();

        BookSearch.findBookByName(name);
    }
}
