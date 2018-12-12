package javaEightFeatures.FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        /*Create anonymous inner Class*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread Created");
            }
        }).start();
    }
}
