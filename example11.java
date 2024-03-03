package lr1;
import java.util.Scanner;

public class example11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Enter your year of birth");
        int year = in.nextInt();
        System.out.println(name + " " + (2024 - year) + " years old");
        in.close();
    }
}
