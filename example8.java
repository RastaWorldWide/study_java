package lr1;
import java.util.Scanner;

public class example8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day of the week");
        String day = in.nextLine();
        System.out.println("Enter month");
        String month = in.nextLine();
        System.out.println("Enter day");
        int day_num = in.nextInt();
        System.out.println(day + " " + day_num + " " +month);
        in.close();
    }

}
