package lr3;

public class test {
    public static void main(String[] args){
        System.out.println(fact(5));
    }

    public static int fact(int n){
        System.out.println("Вызов функции fact(" + n + ")");
        if (n == 0) {
            System.out.println("Возврат значения 0");
            return 0;
        } else if (n == 1){
            System.out.println("Возврат значения 1");
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Возврат значения " + result);
            return result;
        }
    }
}
