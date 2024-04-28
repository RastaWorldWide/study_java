package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        return strings.stream().filter(s -> s.contains(substring)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("class", "string", "car", "dog");
        System.out.println("Строки до обработки:" + strings);

        String mySubstring = "a";
        System.out.println("Подстрока:" + mySubstring);

        List<String> filteredStrings = filterStrings(strings, mySubstring);
        System.out.println("Строки после обработки:" + filteredStrings);
    }
}
