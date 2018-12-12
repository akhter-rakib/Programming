package basic.Thread;

import static java.lang.Thread.MIN_PRIORITY;

public class MainThread extends Thread{
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        /*Getting namme of the main thread*/
        System.out.println("Name : " + thread.getName());
        /*Changing the the thread name */
        thread.setName("Greek and freek");
        /*After name change */
        System.out.println("Changed name : " + thread.getName());
        System.out.println("Main thhread priority : " + thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Changed Priority : " + thread.getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
        // Main thread creating a child thread
        ChildThread ct = new ChildThread();

        // getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: " + ct.getPriority());

        // setting priority of Main thread to MIN(1)
        ct.setPriority(MIN_PRIORITY);

        System.out.println("Child thread new priority: " + ct.getPriority());

        // starting child thread
        ct.start();
    }
}

// Child Thread class
class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
