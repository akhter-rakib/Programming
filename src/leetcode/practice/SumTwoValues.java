package leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTwoValues {
    public ArrayList<Integer> sum(ArrayList<Integer> list, Integer targetValue) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetValue) {
                    return new ArrayList<>(Arrays.asList(i, j));
                }
            }
        }
        throw new IllegalArgumentException("There is no value to be sum of target Value");
    }

    public static void main(String[] args) {
        new SumTwoValues().sum(new ArrayList<>(Arrays.asList(1, 3, 4, 6)), 10);
    }

/*Complexity Analysis

Time complexity : O(n^2).
For each element, we try to find its complement by looping through the rest of array
which takes O(n) time. Therefore, the time complexity is O(n^2)

Space complexity : O(1)*/

}
