package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        return numbers.stream().filter(n -> n % divisor == 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Изначальный список чисел: " + numbers);

        int divider = 3;
        System.out.println("Число, на которое должны делится числа из изначального списка: " + divider);

        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divider);
        System.out.println("Отсортированный список: " + divisibleNumbers);
    }
}
