package lr6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        try {
            final Collection<Thread> threads = createThreads();
            interruptThreads(threads);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Collection<Thread> createThreads() {
        final List<Thread> threads = new ArrayList<>();
        Thread thread;
        for (int i = 0; i < 10; i++) {
            thread = new MyThread();
            thread.start();
            threads.add(thread);
        }
        return threads;
    }

    private static void interruptThreads(Collection<Thread> threads) {
        threads.stream().forEach(Thread::interrupt);
    }
}
