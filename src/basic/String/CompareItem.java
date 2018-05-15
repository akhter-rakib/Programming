package basic.String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompareItem {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(3);

        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer p = (Integer) iterator.next();

        }

    }
}
