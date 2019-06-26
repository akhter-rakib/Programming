package javaEightFeatures.DurgaSoft;

import java.util.function.Function;

public class FirstExample {
    public static int squareIt(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        System.out.println("The square of 4 is " + squareIt(8));

        //we can write the above method by java 8
        Function<Integer, Integer> f = (i)-> i * i;
        System.out.println(f.apply(12));
    }
}
