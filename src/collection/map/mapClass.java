package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rakib on 8/3/2017.
 */
public class mapClass {

    public static void main(String[] args) {
        /*HashSet contains only values whereas HashMap contains entry(key and value).*/
        Map mp = new HashMap<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rakib");
        map.put(2, "jaman");
        map.put(3, "ali");
        map.put(1, "khan");//it is not showing becuase Map key is unique
        // System.out.println(map);
        //New Style to iterator Map value ...
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "->" + m.getValue());
        }
        //OLd Way
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println(m.getKey() + "-->" + m.getValue());
        }

        mp.put("BP", "rakib");
        mp.put("Pulse", "is not Okay");
        System.out.println(mp);
    }

}
