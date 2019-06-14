package Java_coding_bat_JavaQuentionPractice.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapAB2 {

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.get("a") == map.get("b")) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }


    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        Map<String, String> finalResult = new MapAB2().mapAB2(map);
        System.out.println(finalResult);
    }
}
