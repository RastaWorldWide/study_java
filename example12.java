package lr1;
import java.util.Scanner;

public class example12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        System.out.println("You we born in " + (2024 - age));
        in.close();
    }
}
