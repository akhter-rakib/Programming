package basic.Thread;

public class DeadLockDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Entering into DeadLock");
            Thread.currentThread().join();
            System.out.println("THis is never will execute");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
Explanation :
        The statement “Thread.currentThread().join()”, will tell Main thread to wait
        for this thread(i.e. wait for itself) to die.
        Thus Main thread wait for itself to die, which is nothing but a deadlock.
*/
