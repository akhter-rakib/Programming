package javaEightFeatures.DurgaSoft;

import java.util.function.Function;

public class InterFDemo1 {
    public static void main(String[] args) {
        Interf1 interf1 = new InterfImpl1();
        interf1.add(12, 123);

        /* With Lambda Expressions we can Handle by Following */
        Interf1 inter = (int a, int b) -> System.out.println(a + b);
        inter.add(4, 6);

        Interf interf = () -> System.out.println("Hello Bangladesh");
        interf.m1();

        Function
    }
}
