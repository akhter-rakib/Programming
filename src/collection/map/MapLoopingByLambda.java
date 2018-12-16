package collection.map;

import java.util.*;

public class MapLoopingByLambda {
    public static void main(String[] args) {
        Map<String, Integer> mapDemo = new HashMap<String, Integer>();
        mapDemo.put("a", new Integer(100));
        mapDemo.put("b", new Integer(200));
        mapDemo.put("c", new Integer(300));
        mapDemo.put("d", new Integer(400));
        mapDemo.put("f", new Integer(500));

        mapDemo.forEach((k, v) -> {
            if ("f".equals(k)) {
                System.out.println("f value is " + v);
            }
        });
    }
}
