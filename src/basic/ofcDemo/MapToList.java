package basic.ofcDemo;

import java.util.*;

public class MapToList {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("one", "java");
        map.put("two", "spring");
        map.put("three", "hibernate");

        //iterate by java 8
        map.forEach((k, v) ->
                System.out.println(k + "= value pair = " + v));

        //Map value can't be iterate .So, we have to convert it in keySet() or entrySet();

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry nextOne = (Map.Entry) iterator.next();
            System.out.println("Key is " + nextOne.getKey() + "Value is " + nextOne.getValue());
        }

        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



/*

        Set<Map.Entry<String, String>> set = map.entrySet();
        Set<Map.Entry<String, String>> s = map.entrySet();
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(set);

        for (Map.Entry<String, String> entry : list) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
*/
    }
}
