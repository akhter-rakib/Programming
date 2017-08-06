package collection.sorting;

import java.util.Collection;
import java.util.TreeSet;

//If we do not stiesfied with the default natural sorting then we go for comparator
//CompareTo() = Default natural sorting order
//compareTO()
//Comparator() = Customize sorting order
//method = compare and equal
//if we want to implement comparator(i) then we should compalsary implemant compare()
public class ComparatorClass {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparatorClass());
        t.add(10);
        t.add(0);
        t.add(4);
        t.add(1);
        t.add(89);
        System.out.println("Desc order Value is by Comparator "+t);
    }

}
