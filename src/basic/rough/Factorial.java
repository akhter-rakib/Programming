package basic.rough;

import java.util.Scanner;

/**
 * Created by Atuar on 10/9/2017.
 */
public class Factorial {
    public static void main(String[] args) {
        int i, number, fact = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        number = input.nextInt();

        for (i =1; i <= number; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+number+ " is: "+fact);
    }

}
