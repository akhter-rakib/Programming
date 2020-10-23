package InterviewQuestion.Q1.pro;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkiedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList list = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            list.add(linkedList.get(i));
        }
        System.out.println(list);
        ListIterator iterator = linkedList.listIterator();
        while (iterator.hasPrevious()) {
            System.out.println("Next Element" + iterator.hasNext());
        }
    }
}
