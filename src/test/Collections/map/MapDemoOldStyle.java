package test.Collections.map;


import java.util.*;

public class MapDemoOldStyle {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "rakib");
        map.put(2, "moyeen");
        map.put(4, "khan");
        map.put(9, "manza");
        Set set = map.entrySet();//Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
