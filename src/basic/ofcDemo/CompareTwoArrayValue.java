package basic.ofcDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTwoArrayValue {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList(Arrays.asList(2, 4, 6, 10));
        ArrayList<Integer> second = new ArrayList(Arrays.asList(1, 2, 4, 11));
        for (Integer f : first) {
            for (Integer s : second) {
                if (f == s) {
                    System.out.print(" " + f);
                }
            }
        }

    }
}
