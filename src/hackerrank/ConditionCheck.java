package hackerrank;

import java.util.Scanner;

public class ConditionCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userValue = scanner.nextInt();
        if (userValue % 2 == 0 && (2 <= userValue && userValue >= 5) && (16 <= userValue && userValue > 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
