package collection.map;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> mapDemo = new HashMap<String, Integer>();
        mapDemo.put("a", new Integer(100));
        mapDemo.put("b", new Integer(200));
        mapDemo.put("c", new Integer(300));
        mapDemo.put("d", new Integer(400));
        mapDemo.put("f", new Integer(500));

        mapDemo.forEach((k, v) ->
                System.out.println("key: " + k + " value:" + v));
        mapDemo.entrySet().stream().filter(local -> local.getKey().equalsIgnoreCase("a"));

    }

}