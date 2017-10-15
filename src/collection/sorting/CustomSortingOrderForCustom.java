package collection.sorting;

import java.util.Comparator;

public class CustomSortingOrderForCustom implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1; //akhen 0 holo i1
        Integer i2 = (Integer) o2;//akhne 10 holo i2
        if (i1 < i2) {//akhene 10 root so jodi i1 coto hoi tahole + dibo and boro hole - hobe
            return +1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}
