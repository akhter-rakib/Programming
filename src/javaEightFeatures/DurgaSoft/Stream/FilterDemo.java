package javaEightFeatures.DurgaSoft.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(151);
        list.add(6);
        list.add(18);
        list.add(7);
        System.out.println(list);
        List<Integer> evenListTwo = new ArrayList<>();
        list.forEach(i ->
        {
            if (i % 2 == 0) {
                evenListTwo.add(i);
            }
        });
        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        /*Look the program carefully here we have filter our object depend on condition and collect it to the List*/
        System.out.println(evenListTwo);
        System.out.println(evenList);
    }
}
