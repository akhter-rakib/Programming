package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rakib on 8/3/2017.
 */
public class mapClass {

    public static void main(String[] args) {
        Map mp=new HashMap<>();
        Map<Integer, String> map =new HashMap<>();
        map.put(1,"Rakib");
        map.put(2,"jaman");
        map.put(3,"ali");
        map.put(1,"khan");
        System.out.println(map);

        mp.put("BP","rakib");
        mp.put("Pulse","is not Okay");
        System.out.println(mp);
    }

}
