package test;

import java.util.Scanner;

/*The Fibonacci series is a series where the next term is the sum of pervious two terms.
        The first two terms of the Fibonacci sequence is 0 followed by 1.*/
public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*  Integer fNumber, sNumber, lSeries;
        System.out.println("Give the First Number");
        fNumber = scanner.nextInt();
        System.out.println("Give the Second Number");
        sNumber = scanner.nextInt();
        System.out.println("Limitation of the series");
        lSeries = scanner.nextInt();*/


        int f = 0, l = 1, n = 0, lm;
        System.out.println("Give the las limit of the series");
        lm = scanner.nextInt();
        System.out.println("" + f + "" + l);
        for (int i = 0; i < 15; i++) {
            n = f + l;
            f = l;
            l = n;
            if (n > lm) {
                break;
            }
            System.out.println("  " + n);
        }
    }
}
