package Java_coding_bat_JavaQuentionPractice.map;
/*Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Topping {

    public Map<String, String> topping(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("ice cream", "peanuts");
        Map<String, String> finalOne = new Topping().topping(map);
        System.out.println(finalOne);
    }
}
