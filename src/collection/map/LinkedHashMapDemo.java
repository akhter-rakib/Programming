package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/*It is same as HashMap instead maintains insertion order.*/
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(1, "Mokha");
        lhm.put(2, "Manza");
        lhm.put(3, "Jasim");
        lhm.put(4, "Taz");
        for (Map.Entry m : lhm.entrySet()) {
            System.out.println(m.getKey() + "-->" + m.getValue());
        }
        lhm.forEach((k, v) -> {
            System.out.println("Key-> : " + k + " value : " + v);
        });
        lhm.entrySet().forEach(entry -> {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        });
        lhm.forEach((k, v) -> {
            if (k.equals(3)) {
                System.out.println("Key is " + k + " Filter Value is " + v);
            }
        });
    }
}
