package lr2;

public class Example2 {
    public static void main(String[] args) {
        int lines = 5;
        int columns = 5;
        int[][] array = fillSnakeArray(lines, columns);
        displayArray(array);
    }

    public static int[][] fillSnakeArray(int lines, int columns) {
        int[][] array = new int[lines][columns];
        int value = 1;

        for (int i = 0; i < lines; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = value;
                    value++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    array[i][j] = value;
                    value++;
                }
            }
        }

        return array;
    }

    public static void displayArray(int[][] array) {
        System.out.println("Двумерный массив(змейкой):");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
