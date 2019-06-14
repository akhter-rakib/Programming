package basic.rough;

import java.util.ArrayList;
import java.util.Collections;

public class LowestValueOfalist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(12);
        arrayList.add(19);
        Integer minValue = Collections.min(arrayList);
        System.out.println(minValue);

        Integer lowestValue = arrayList.get(0);
        for (Integer val : arrayList) {
            if (lowestValue > val) {
                lowestValue = val;
            }
        }
        System.out.println(lowestValue);
    }
}
