package Java_coding_bat_JavaQuentionPractice.logic_1;

import java.util.Scanner;

/*The number 6 is a truly great number. Given two int values, a and b,
        return true if either one is 6. Or if their sum or difference is 6.
        Note: the function Math.abs(num) computes the absolute value of a number.
        love6(6, 4) → true
        love6(4, 5) → false
        love6(1, 5) → true*/
public class Love6 {
    public boolean love6(int a, int b) {
        boolean status = true;
        if (a == 6 || b == 6) {
            status = true;
        } else if ((a + b) == 6) {
            status = true;
        } else if (a > b && (a - b) == 6) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public static void main(String[] args) {
        Love6 love6 = new Love6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Vallue");
        int a = scanner.nextInt();
        System.out.println("Second Value ");
        int b = scanner.nextInt();

        boolean status = love6.love6(a, b);
        System.out.println("--------------" + status);
    }
}
