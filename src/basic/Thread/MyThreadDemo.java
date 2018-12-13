package basic.Thread;

public class MyThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread(i);
            myThread.start();
            Thread thread = new Thread(new MyThreadInterface());
            thread.start();
        }
    }
}
