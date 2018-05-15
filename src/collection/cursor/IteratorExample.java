package collection.cursor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rakib on 7/29/2017.
 */
public class IteratorExample {

    public static void main(String[] args) {
        ArrayList arl = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            arl.add(i);
        }
        Iterator itr = arl.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            if (i % 2 == 0) {
                System.out.println("The Even value of the List is " + i);
            } else {
                System.out.println("The Odd value of the List is " + i);
            }
        }

    }

}
