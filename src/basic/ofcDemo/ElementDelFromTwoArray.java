package basic.ofcDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementDelFromTwoArray {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList();
        num.add(1);
        num.add(2);
        num.add(3);
        ArrayList<Integer> num2 = new ArrayList();
        num2.add(3);
        num2.add(2);

        ArrayList<Integer> list = num;
        Iterator<Integer> iterator = list.iterator();
        Integer nextValue;
        boolean needToBeDeleted = false;
        while (iterator.hasNext()) {
            nextValue = iterator.next();
            for (Integer innerValue : num2) {
                if (nextValue == innerValue) {
                    needToBeDeleted = true;
                }
            }
            if (needToBeDeleted) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }

}
