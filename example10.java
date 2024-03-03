package lr1;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int year = in.nextInt();
        System.out.println("You " + (2024 - year) + " years old");
        in.close();
    }
}
