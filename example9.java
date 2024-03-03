package lr1;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month");
        String month = in.nextLine();
        System.out.println("Day of month");
        int day_month = in.nextInt();
        System.out.println("In " + month + " " + day_month + " days");
        in.close();
    }
}
