package basic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SearchExisorDifValue {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        ArrayList b = new ArrayList();
        b.add(1);
        b.add(2);
        b.add(3);
        ArrayList c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (c.get(i) == b.get(j)) {
                    c.remove(c.get(i));
                }
            }
        }
        for (int i = 0; i < b.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (b.get(i) == a.get(j)) {
                    b.remove(b.get(i));
                }
            }
        }
        System.out.println("c is " + c);
        System.out.println("b is " + b);
        System.out.println("a is " + a);


    }
}
