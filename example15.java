package lr1;
import java.util.Scanner;

public class example15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = in.nextInt();
        System.out.println("Enter num2");
        int num2 = in.nextInt();
        System.out.println("Sum " + (num1 + num2));
        System.out.println("Difference " + (num1 - num2));
        in.close();
    }
}
