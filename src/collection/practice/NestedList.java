package collection.practice;

import java.util.ArrayList;
import java.util.List;

public class NestedList {

    public static void nestedList() {
        List<ArrayList<Integer>> c = new ArrayList();
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        a.add(2);
        a.add(6);
        a.add(8);
        b.add(0);
        b.add(80);
        b.add(10);
        c.add(a);
        c.add(b);

        for (int i = 0; i < c.size(); i++) {
            for (int j = i; j < c.get(i).size(); j++) {
                System.out.println(c.get(i).get(j));
            }
        }
    }

    public static void main(String[] args) {
        nestedList();
    }
}
