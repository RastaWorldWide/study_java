package lr4.Example2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество строк: ");
            int line = scanner.nextInt();

            System.out.print("Введите количество столбцов: ");
            int column = scanner.nextInt();

            int[][] matrix = new int[line][column];
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < line; j++) {
                    System.out.print("Введите элемент матрицы: ");
                    matrix[j][i] = scanner.nextInt();
                }
            }

            System.out.print("Введите номер столбца: ");
            int numberColumn = scanner.nextInt();

            System.out.print(Arrays.toString(matrix[column]));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Ввод строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Нет столбца с таким номером");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: Матрица не может быть с отрицательной шириной и высотой");
        }
    }
}
