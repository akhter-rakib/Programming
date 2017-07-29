package collection.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Rakib on 7/29/2017.
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("rakib");
        linkedList.add("hasan");
        linkedList.add("jaman");
        linkedList.add("khan");
        System.out.println(linkedList);
        ListIterator litr = linkedList.listIterator();
        while (litr.hasNext()) {
            String i = (String) litr.next();
            if (i.equals("rakib")) {
                litr.remove();
            } /*else if (i.equals("khan")) {
                litr.add("khan Ali");
            } */else if (i.equals("jaman")) {
                litr.set("Aman");
            }
        }
        System.out.println("After the operation it  becomes " + linkedList);
    }
}
