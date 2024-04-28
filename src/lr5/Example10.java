package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static List<Integer> filterSmallNumbers(List<Integer> numbers, int threshold) {
        return numbers.stream().filter(n -> n < threshold).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Изначальный список чисел: " + numbers);

        int max = 5;
        System.out.println("Максимальное значение: " + max);

        List<Integer> smallNumbers = filterSmallNumbers(numbers, max);
        System.out.println("Отсортированный список: " + smallNumbers);
    }
}
