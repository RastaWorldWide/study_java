package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println("Массив array: ");
        System.out.println(Arrays.toString(arr));
        int[] arrayResult = filterEvenNumbers(arr);
        System.out.println("Массив arrayResult: ");
        System.out.println(Arrays.toString(arrayResult));
    }

    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}
