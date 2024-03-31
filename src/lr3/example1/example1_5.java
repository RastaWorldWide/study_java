package lr3.example1;

public class example1_5 {
    public static void main(String[] args) {
        fact(5);
    }

    public static int fact(int n) {
        return fact(n, 0);
    }

    private static int fact(int n, int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("\t");
        }
        System.out.println(indent + "fact(" + n + ")");
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int result = fact(n - 2, depth + 1) + fact(n - 1, depth + 1);
            System.out.println(indent + "Return " + result);
            return result;
        }
    }
}

