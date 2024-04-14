package lr4.Example2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try {
            double counter = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");


            try {
                int length = scanner.nextInt();
                int[] array = new int[length];

                for (int i = 0; i < length; i++) {
                    System.out.print("Введите элемент массива: ");
                    array[i] = scanner.nextInt();
                }

                int sum = 0;
                for (int i : array) {
                    if (i > 0) {
                        sum += i;
                        counter += 1;
                    }
                }

                try {
                    System.out.print("Среднее значение положительных элементов одномерного массива: " + sum / counter);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка: Положительные элементы отсутствуют");
                }

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Ввод строки вместо числа");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Несоответствие числового типа данных");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
