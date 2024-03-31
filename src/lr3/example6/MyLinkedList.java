package lr3.example6;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        int N = 10;
        LinkedList<Integer> circle = new LinkedList<>();

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