package javaEightFeatures.DurgaSoft;


public class InterFDemo {
    public static void main(String[] args) {

        Interf interf1 = new InterfImpl();
        interf1.m1();
        //using lambda without implemented class
        Interf interf2 = () -> System.out.println("Hello Rakib");
        interf2.m1();
    }
}
