package lr3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Двочиный вид числа " + number + ": " + Binary(number));
    }

    public static String Binary(int number){
        if (number == 0){
            return "0";
        } else if (number == 1){
            return "1";
        } else {
            return Binary(number / 2) + number % 2;
        }

    }
}
