package test.Collections.map;

import java.util.*;

public class MapDemoNewStyle {
    public static void €main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "rakib");
        map.put(101, "khan");
        map.put(102, "zamal");
        map.put(103, "kkobir");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key" + entry.getKey() + "Value " + entry.getValue());
        }
    }
}
