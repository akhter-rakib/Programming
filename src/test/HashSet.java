package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set s = new LinkedHashSet<>();
        s.add(5);
        s.add(2);
        s.add(1);//Dublicate value is not allowed
        s.add(4);
        s.add(1);
        System.out.println(s);
    }
}
