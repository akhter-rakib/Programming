package collection.listInterface.Vector;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(12);
        v.add(2);
        v.add(10);
        v.add(9);
        v.add("Kasem khan");
        Iterator itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
