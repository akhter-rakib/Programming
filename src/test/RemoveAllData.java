package test;

import java.util.ArrayList;

public class RemoveAllData {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);


    }
}
