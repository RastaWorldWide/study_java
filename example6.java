package lr1;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your surname: ");
        String surname = in.nextLine();
        System.out.println("Enter your otchestvo: ");
        String otchestvo = in.nextLine();

        System.out.println("Hello, " + surname + ' ' + name + ' ' + otchestvo + '!');
        in.close();
    }
}
