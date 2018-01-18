package javaEightFeatures;

import java.util.ArrayList;
import java.util.List;

public class ForeEachLoop {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("anik");
        list.add("hasan");
        list.add("Khan");
        list.add("jaman");
        for(String s : list){
            System.out.println(s);
        }
        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}
