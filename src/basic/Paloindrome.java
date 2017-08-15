package basic;

import java.util.Scanner;

public class Paloindrome {
    public static void main(String[] args) {
        String input, reverse = "";
        int i;
        Scanner src = new Scanner(System.in);
        System.out.printf("Give a String Value to Palindrome\n");
        input = src.nextLine();
        int length = input.length();
        i = length - 1;
        while (i >= 0) {
            reverse = reverse + input.charAt(i);
            i--;
        }
        if (input.equalsIgnoreCase(reverse)) {
            System.out.println("You Given String " + input + "is a Palindrome value ");
        } else {
            System.out.println("You Given String " + input + "is not Palindrome value ");

        }

    }
}
