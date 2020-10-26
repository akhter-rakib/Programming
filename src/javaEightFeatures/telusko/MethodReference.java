package javaEightFeatures.telusko;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 8, 10);
        /*We just tell here the forEach method what you have to do print the values,
        We tell the it that we want to just print the value then we will give the println . So
        we are telling to get the method so we are using :: Here :: indicate the method reference
         Which method and and which class then we are indicate it*/
        list.forEach(System.out::println);
    }
}
