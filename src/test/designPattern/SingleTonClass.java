package test.designPattern;

public class SingleTonClass {
    public static void main(String[] args) {
        SingleTonDemo singleTonDemo = SingleTonDemo.getInstance();
        singleTonDemo.dosomething();
    }
}
