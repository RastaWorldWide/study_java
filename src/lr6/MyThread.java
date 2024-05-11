package lr6;

public final class MyThread extends Thread {
    private static int counter;
    private final int id;

    public MyThread() {
        this.id = counter++;
    }
    @Override
    public void run() {
        System.out.println("Thread № " + this.id);
    }
    public int getThreadId() {
        return this.id;
    }
}
