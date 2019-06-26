package javaEightFeatures.DurgaSoft;

import java.util.function.Predicate;

public class EvenOdd {

    public static void main(String[] args) {
        Predicate<Integer> p = (i) -> i % 2 == 0;
        System.out.println(p.test(15));


        Predicate<Integer> d = i -> i % 2 == 0;
        System.out.println(d.test(34));
    }
}
