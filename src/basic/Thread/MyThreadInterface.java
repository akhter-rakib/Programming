package basic.Thread;

public class MyThreadInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread id " + Thread.currentThread().getId());
    }
}
