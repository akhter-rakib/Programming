package basic.String;

import java.util.Scanner;

//Check using Regex
public class AlphabeticOnly {

    static boolean isAlphabet(String str) {
        return (!str.equals("") && (str != null) && (str.matches("^[a-zA-Z]*$")));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please give a String to check only Alphabet or not");
        String str = scanner.nextLine();
        boolean status = isAlphabet(str);
        System.out.println(status);
    }
}
