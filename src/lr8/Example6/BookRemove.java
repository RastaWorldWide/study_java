package lr8.Example6;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BookRemove {
    public static void removeBookByName(String name) {
        try {
            FileReader reader = new FileReader("src/lr8/Example6/book.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject library = (JSONObject) jsonParser.parse(reader);
            JSONArray books = (JSONArray) library.get("books");

            for (int i = 0; i < books.size(); i++) {
                JSONObject book = (JSONObject) books.get(i);
                if (book.get("name").equals(name)) {
                    books.remove(i);
                    System.out.println("Книга \"" + name + "\" успешна удалена из библиотеки.");
                    break;
                }
            }

            library.put("books", books);
            FileWriter file = new FileWriter("src/lr8/Example6/book.json");
            file.write(library.toJSONString());
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги, которое хотите удалить:");
        String name = scanner.nextLine();

        BookRemove.removeBookByName(name);
    }
}
