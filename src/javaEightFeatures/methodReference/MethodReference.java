package javaEightFeatures.methodReference;

public class MethodReference implements Sayable{

    public static void saySomething() {
        System.out.println("Hello this is Static Method");
    }

    public static void main(String[] args) {
//        Sayable sayable = MethodReference::saySomething;
//        sayable.say();
    }

    @Override
    public void say() {

    }
}
