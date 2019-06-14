package Java_coding_bat_JavaQuentionPractice.map;
/*https://www.javatpoint.com/java-map*/

import java.util.LinkedHashMap;
import java.util.Map;

public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static void main(String[] args) {
        MapBully mapBully = new MapBully();
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("a", "a value");
        map.put("b", "b value");
        System.out.println(map);
        Map<String, String> finalResult = mapBully.mapBully(map);
        System.out.println(finalResult);

    }
}
