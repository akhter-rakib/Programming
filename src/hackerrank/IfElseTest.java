package hackerrank;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a int values");
        int value = scanner.nextInt();
        System.out.println("Your value is " + value);
        if ((value % 2) == 0 && (2 <= value && value <= 5)) {
            System.out.println("this is even no " + value);
        } else {
            System.out.println("this is odoo no " + value);
        }
    }
}
