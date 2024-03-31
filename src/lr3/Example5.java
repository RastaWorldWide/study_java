package lr3;

import java.util.HashMap;

public class Example5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");

        StringBuilder commaSeparatedStrings = new StringBuilder();
        int product = 1;

        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (key > 5) {
                commaSeparatedStrings.append(value).append(", ");
            }

            if (value.length() > 5) {
                product *= key;
            }
        }

        // Удаляем последнюю запятую и пробел, если они есть
        if (commaSeparatedStrings.length() > 0) {
            commaSeparatedStrings.delete(commaSeparatedStrings.length() - 2, commaSeparatedStrings.length());
        }

        System.out.println("Строчки с ключом > 5:");
        System.out.println(commaSeparatedStrings.toString());
        System.out.println("Произведение ключей > 5: " + product);
    }
}
