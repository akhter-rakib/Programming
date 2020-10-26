package javaEightFeatures.telusko;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTwo {
    public static void doubletheValue(Integer i) {
        System.out.println(i * i);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 12, 30);
        list.forEach(MethodReferenceTwo::doubletheValue);

    }
}
