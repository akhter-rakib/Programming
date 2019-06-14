package basic.rough;

import java.util.ArrayList;

public class TwoArrayValueCompair {
    public static void main(String[] args) {
        ArrayList ar1 = new ArrayList();
        ArrayList ar2 = new ArrayList();

        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar2.add(2);
        ar2.add(3);
        ArrayList ar3 = new ArrayList(ar1);
        ArrayList ar4 = new ArrayList(ar2);
        ar4.removeAll(ar3);
        System.out.println(ar4);

    }
}
