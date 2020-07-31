package test;

public class DemoClass {

    static DemoClass  a;

    public static void doSomeThing() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
       DemoClass.a.doSomeThing();
    }

}
