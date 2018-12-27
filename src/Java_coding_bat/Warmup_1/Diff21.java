package Java_coding_bat.Warmup_1;

import java.util.Scanner;

/*Given an int n, return the absolute difference
        between n and 21, except return double the absolute difference if n is over 21*/
public class Diff21 {
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static void main(String[] args) {
        int value, diff;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give a value to make difference from 21 or double the absulate diff");
        value = scanner.nextInt();
        Diff21 diff21 = new Diff21();
        diff = diff21.diff21(value);
        System.out.println("Main difference is " + diff);
    }
}
