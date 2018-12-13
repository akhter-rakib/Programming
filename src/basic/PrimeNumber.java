package basic;

import java.util.Scanner;
/*A prime number is a positive integer which is divisible only by 1 and itself. For example: 2, 3, 5, 7, 11, 13*/
public class PrimeNumber {
    public static void main(String[] args) {
        Integer number;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Give a number to check prime or not \n");
        number = input.nextInt();
        for (int i = 2; i < number / 2; i++) {
            if (number % 2 == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Your Given Number" + number + " is Prime Number");
        } else {
            System.out.println("Your Given Number" + number + " is not Prime Number");
        }
    }

}
