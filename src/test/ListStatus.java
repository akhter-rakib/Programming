package test;

import java.util.ArrayList;
import java.util.List;

public class ListStatus {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        if (list == null || list.isEmpty()) {
            System.out.println("THis is empty");
        }
        if (list == null) {
            System.out.println("this is null too");
        }
    }
}
