package basic.rough;

import java.util.Scanner;

/*Java program to demonstrate How to find Greatest Common Divisor or GCD of
        * two numbers using Euclid’s method.*/
/*
Let' take an example of calculating GCD of 54 and 24 using Euclid's algorithm. Here X = 54 and Y = 24,
        since Y is not zero we move to the logical part and assign X = Y, which means X becomes 24 and Y
        becomes 54%24 i.e 6. Since Y is still not zero, we again apply the logic. This times X will become
        6 and Y will become 24%6 i.e. Y=0. Bingo, Y is now zero which means we have our answer
        and it's nothing but the value of X which is 6 (six).
*/
public class GCD_GreatestCommonDivison {
    private static int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;

        }
        return findGCD(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
        System.out.println("GCD of Two numbers " + number1 + " and " + number2 + " is : " + findGCD(number1, number2));


    }
}
