package collection.sorting;

import java.util.Comparator;

/**
 * Created by Rakib on 8/2/2017.
 */
public class MyComparatorClass implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;//here i1=0
        Integer i2 = (Integer) o2;//here i2=10; for the first time
        if (i1 < i2) {
            return +1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}
