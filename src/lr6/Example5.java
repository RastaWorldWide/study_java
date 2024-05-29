package lr6;

import java.util.Arrays;
import java.util.OptionalInt;

public class Example5 {
    static int[] array = {0, 1, 2, 3, 4, 5, 6};
    public static int maxValue = 0;

    static class MyThread extends Thread {
        public MyThread(String s) {
            super(s);
        }

        @Override
        public synchronized void run() {
            OptionalInt max = Arrays.stream(array).max();
            maxValue = max.getAsInt();
            System.out.println(maxValue);
            this.interrupt();
        }

        public static void main(String[] args) {
            for(int i=1; i < 6; i++)
                new MyThread("Thread " + i).start();
        }
    }
}

