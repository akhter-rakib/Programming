package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LowestValueOfMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 1);

        int minKey = map.entrySet().iterator().next().getValue();
        int minValue = map.entrySet().iterator().next().getKey();
        System.out.println();
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            if (map1.getValue() < minValue) {
                minKey = map1.getKey();
                minValue = map1.getValue();
            }
        }
        System.out.println(minKey + " Value " + minValue);
        Map<Integer, Integer> lowestKeyValue = new LinkedHashMap<>();
        lowestKeyValue.put(minKey, minValue);
    }
}
