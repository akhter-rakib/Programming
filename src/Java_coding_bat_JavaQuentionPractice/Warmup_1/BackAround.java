package Java_coding_bat_JavaQuentionPractice.Warmup_1;
/*Given a string, take the last char and return a new string with the
        last char added at the front and back, so "cat" yields "tcatt".
        The original string will be length 1 or more.
        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"*/

import java.util.Scanner;

public class BackAround {
    public String backAround(String str) {
        String aroundValue;
        aroundValue = str.substring(str.length() - 1);
        return aroundValue + str + aroundValue;
    }

    public static void main(String[] args) {
        String userGivenValue, arroundValue;
        BackAround around = new BackAround();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give String value plz");
        userGivenValue = scanner.nextLine();
        arroundValue = around.backAround(userGivenValue);
        System.out.println("Your Around value is " + arroundValue);
    }
}
