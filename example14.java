package lr1;
import java.util.Scanner;

public class example14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num");
        int num = in.nextInt();
        int num4 = ((num - 1) + num + (num + 1)) * ((num - 1) + num + (num + 1));
        System.out.println((num - 1) + " " + num + " " + (num + 1) + " " + num4);
        in.close();
    }
}
