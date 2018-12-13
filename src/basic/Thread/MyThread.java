package basic.Thread;

public class MyThread extends Thread {

    private Integer price;

    public MyThread(int price) {
        this.price = price;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread Class id " + price);
        } catch (Exception e) {

        }

    }
}
