package lr8.Example6;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Example6 {
    public static void main(String[] args) {
        JSONObject book_tracker = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("author", "Толстой");
        book1.put("year", "1867");
        book1.put("name", "Война и мир");

        JSONObject book2 = new JSONObject();
        book2.put("author", "Толкин");
        book2.put("year", "1954");
        book2.put("name", "Властелин Колец");

        books.add(book1);
        books.add(book2);

        book_tracker.put("books", books);

        try (FileWriter file = new FileWriter("src/lr8/Example6/book.json")) {
            file.write(book_tracker.toJSONString());
            System.out.println("Json файл успешно создал!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
