package javaEightFeatures.lambdaExpression;

import java.util.ArrayList;

public class ForeEach {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(25);
        arrayList.add(2);

        for (Integer i : arrayList) {
            System.out.println(i);
        }
        arrayList.forEach(n -> System.out.println(n));
        arrayList.forEach(p-> System.out.println(p.equals(2)));
    }
}
