package Java_coding_bat_JavaQuentionPractice.Warmup_1;

import java.util.Scanner;

/*Given an int n, return true if it is within 10 of 100 or 200.
        Note: Math.abs(num) computes the absolute value of a number.
       nearHundred(93) → true
        nearHundred(90) → true
        nearHundred(89) → false*/
public class NearHundred {
    public boolean nearHundred(int a) {
        return (Math.abs(100 - a) <= 10 || Math.abs(200 - a) <= 10);
    }

    public static void main(String[] args) {
        boolean ner10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a User Value");
        int userValue = scanner.nextInt();
        ner10 = new NearHundred().nearHundred(userValue);
        System.out.println("Within 10 of 100 or 200" + ner10);
    }
}
