package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(ArrayList<Integer> arry, Integer left, Integer right, Integer s) {
        Integer i = 0;
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arry.get(mid) == s) {
                i++;
                System.out.println("How many time it need to run "+i);
                return mid;

            } else if (arry.get(mid) > s) {
                i++;
                return binarySearch(arry, left, right = mid - 1, s);

            } else {
                i++;
                return binarySearch(arry, left = mid + 1, right, s);
            }
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        ArrayList element = new ArrayList();
        Integer l = 0, r, s;
        ArrayList<Integer> arry = new ArrayList<>(Arrays.asList(1, 2, 6, 8, 10, 34, 90, 100));
        System.out.println(arry);
        System.out.println("Give a number to search form the Array");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();
        r = arry.size();
        Integer valueSearCh = binarySearch(arry, l, r, s);
        if (valueSearCh == -1) {
            System.out.println("painai");
        } else {
            System.out.println("Your location is " + valueSearCh);
        }

    }

}
