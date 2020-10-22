package javaEightFeatures.telusko;

import java.util.Arrays;
import java.util.List;

public class forEachLoop {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 8, 10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*By Enhanced for loop */
        for (Integer value : list) {
            System.out.println(value);
        }
        /*forEach loop and its internal forEach loop in java collection*/
        list.forEach(value -> System.out.println(value)); //It is Interface class name is Consumer InterFace
    }
}
