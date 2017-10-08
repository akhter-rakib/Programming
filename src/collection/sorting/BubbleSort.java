package collection.sorting;

import java.util.ArrayList;
import java.util.Arrays;
//Algorithm = https://www.programiz.com/dsa/bubble-sort

public class BubbleSort {

    static void bubbleSort(ArrayList<Integer> list) {
        Integer n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //The Reason behind limit n-i-1 is for better performance,
                // in second step, last and second last elements are not
                // compared because, the proper element is Automatically placed
                // at last after first step.
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    static void afterBubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Bubble Sorting Array " + list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arry = new ArrayList<Integer>(
                Arrays.asList(5, 1, 19, 4));
        bubbleSort(arry);
        afterBubbleSort(arry);
    }
}
