package basic.String;
//Check if a string contains only alphabets in Java using Lambda expression
//The idea is to use isLetter() method of Character class.
//check using Lambda Expression Character::isLetter()

import java.util.Scanner;

public class AlphabetOnlyByLambdaExpression {

    static boolean isAlphabet(String str) {
        return (!str.equals("") && (str != null)
                && (str.chars().allMatch(Character::isLetter)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please give a String to check only Alphabet or not");
        String str = scanner.nextLine();
        boolean status = isAlphabet(str);
        System.out.println(status);
    }
}
