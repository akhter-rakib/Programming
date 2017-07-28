package collection;
//doublicate allowed and insertion order preserved
//all collection interface are seriable and clonable but only arrayList and vector are random access
//linkList is the best choice if ur frequent operarion is insertion and deletion in the middle
//usualy we use linkList for stack and queues

import java.util.LinkedList;

/**
 * Created by Rakib on 7/29/2017.
 */
public class LinkListExample {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("rakib");
        linkedList.add("hasan");
        linkedList.add("ata");
        linkedList.add(0,"Shole");
        linkedList.addFirst("Kasem");//kasem first a bosbe karon addfirst() method use kora hoase
        System.out.println(linkedList);

    }
}
