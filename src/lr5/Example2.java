package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }
        System.out.println("Массив array1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив array2: ");
        System.out.println(Arrays.toString(arr2));
        int[] arrayResult = findCommonElements(arr1, arr2);
        System.out.println("Массив arrayResult: ");
        System.out.println(Arrays.toString(arrayResult));
    }

    public static int[] findCommonElements(int[] array1, int[] arr2) {
        return Arrays.stream(array1)
                .filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x))
                .toArray();
    }
}
