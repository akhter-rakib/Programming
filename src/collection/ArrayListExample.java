package collection;
//if ur frequent operation is retrival operation then we should go for ArrayList
//because ArrayLsit implement random access interface
//Java ArrayList allows random access because array works at the index basis.
//ArrayList is the worst choice if our insertion of deletion
//several shift operation are require
//usualy we use collection to hold and transfer object from one place to
//another place to provide support for this requirement every collection already implement seializable and cloneable interface


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Rakib on 7/28/2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arl = new ArrayList();
        arl.add(12);
        arl.add("rakib");
        arl.add(1);
        System.out.println(arl);
        System.out.println("There are two ways to traverse collection elements:\n" +
                "\n" +
                "1.By Iterator interface.\n" +
                "2.By for-each loop.");
        for(Object al : arl){
            System.out.println(al);
        }
        System.out.println("traverse by iterator");
        Iterator itr =arl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
