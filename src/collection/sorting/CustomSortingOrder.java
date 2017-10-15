package collection.sorting;

import java.util.TreeSet;

public class CustomSortingOrder {


    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new CustomSortingOrderForCustom());
        treeSet.add(10);
        treeSet.add(0);//(0,10)(i1 ,i2)
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(20);
        System.out.println(treeSet);
    }
}
