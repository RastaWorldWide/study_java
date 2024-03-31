package lr3.example6;

import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args) {
        int N = 10;
        ArrayList<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int idx = 0;
        while (circle.size() > 1) {
            idx = (idx + 1) % circle.size();
            circle.remove(idx);
        }

        System.out.println("Остался человек с номером: " + circle.get(0));
    }
}
