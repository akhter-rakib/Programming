package javaEightFeatures.practiceAgain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForLoopPro {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 100);
        items.put("B", 101);
        items.put("C", 102);
        items.put("D", 103);
        //Since all maps in Java implement Map interface, following techniques will work for any map
        // implementation (HashMap, TreeMap, LinkedHashMap, Hashtable, etc.)
        for (Map.Entry<String, Integer> map : items.entrySet()) {
            System.out.println(map.getKey() + +map.getValue());
        }

        items.forEach((k, v) -> {
            if ("E".equals(v)) {
                System.out.println("What is this");
            }
        });

        items.forEach((k, v) -> System.out.println("Kye is  " + k + " Value is " + v));

        List<Integer> value = new ArrayList<>();
        value.add(10);
        value.add(11);
        value.add(13);
        System.out.println(value.size());
        for (int i = 0; i < value.size(); i++) {
            System.out.println(value.get(i));
        }
        for (Integer i : value) {
            System.out.println(i);
        }
        value.forEach(its -> System.out.println(its));
    }
}
