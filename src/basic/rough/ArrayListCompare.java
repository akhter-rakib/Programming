package basic.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCompare {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));//given test
        List<Integer> b = new ArrayList<Integer>(Arrays.asList(1, 2, 4));//out of hospital test list
        boolean isfound;
        for (int i = 0; i < a.size(); i++) {
            isfound = false;
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j)) {
                    isfound = true;
                    break;
                }
            }
            if (!isfound) {
                System.out.println("This is Our Hospital Test" + a.get(i));
            } else {
                System.out.println("This is not out Hospital Test" + a.get(i));
            }
        }
    }
}
