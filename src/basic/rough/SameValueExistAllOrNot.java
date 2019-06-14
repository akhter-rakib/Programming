package basic.rough;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SameValueExistAllOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(1);
        num.add(1);
        num.add(5);
        System.out.println(num);
        boolean value = toCheckSameOrDiff(num);
        if (value) {
            System.out.println("Different value ");
        } else {
            System.out.println("All are same value ");
        }

    }

    public static boolean toCheckSameOrDiff(ArrayList<Integer> num) {
        if (num == null || num.size() == 1) {
            return false;
        }
        for (Integer i = 1; i < num.size(); i++) {
            if (num.get(i) != num.get(0)) {
                return true;
            }
        }
        return false;
    }
}
