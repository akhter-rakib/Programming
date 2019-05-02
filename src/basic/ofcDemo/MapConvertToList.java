package basic.ofcDemo;

import java.util.*;

public class MapConvertToList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Rakib");
        map.put(101, "Jasim");
        map.put(102, "Khan");
        map.put(103, "Kobir");


        Set<Map.Entry<Integer, String>> set = map.entrySet();

        List<Map.Entry<Integer, String>> list = new ArrayList<>(set);
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println("Key :" + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
