package basic.ofcDemo;

import java.util.ArrayList;
import java.util.List;

public class RemoveObj {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList();

        a.add(12);
        a.add(11);
        a.add(1);
        a.add(2);
        List<Integer> b = new ArrayList(a);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 2) {
                a.remove(i);
            }
        }
        System.out.println("a = " + a);
        System.out.println("b =" + b);
    }
}
