package Java_coding_bat_JavaQuentionPractice.Warmup_1;

import com.sun.xml.internal.org.jvnet.fastinfoset.sax.FastInfosetReader;

import java.util.Scanner;

/*Given a non-empty string and an int n,return a new string where the char at
        index n has been removed.The value of n will be a valid index of a char in the
        original string(i.e.n will be in the range 0..str.length()-1inclusive).
        missingChar("kitten",1) → "ktten"
        missingChar("kitten",0) → "itten"
        missingChar("kitten",4) → "kittn"*/
public class MissingChar {
    public String missingChar(String str, int n) {
        String firstPart, secondPart;
        secondPart = str.substring(n + 1);
        firstPart = str.substring(0, n);
        return firstPart.concat(secondPart);
    }

    public static void main(String[] args) {
        String userValue, missingCharValue;
        int index;
        MissingChar missingChar = new MissingChar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a String");
        userValue = scanner.nextLine();
        System.out.println("Give a index to remove index place value");
        index = scanner.nextInt();
        System.out.println("Index" + index);
        System.out.println("Length" + userValue.length());
        if (index >= 0 && userValue.length() > index) {
            missingCharValue = missingChar.missingChar(userValue, index);
            System.out.println("Without selected index value " + missingCharValue);
        } else {
            System.out.println("Please give index range 0..str.length()-1 inclusive");
        }
    }
}
