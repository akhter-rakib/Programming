package test.designPattern;

public class SingleTonDemo {
    public static SingleTonDemo singleTonDemo = new SingleTonDemo();

    private SingleTonDemo() {

    }

    public static SingleTonDemo getInstance() {
        return singleTonDemo;
    }

    public void dosomething() {
        System.out.println("Hello BroThers");
    }

}
