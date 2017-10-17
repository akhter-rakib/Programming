package basic.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTimeExceptionDemo {
    public static void main(String[] args) {
        System.out.println("please enter your age ");
        Scanner scanner = new Scanner(System.in);
        ///int age = scanner.nextInt(); ae declare ta o try catch ar vitore korte hobe na hole Exception dhorte parbe na
        try {
            int age = scanner.nextInt();//user int ar place a String dia dite pare ... so se khetre Exception aste pare se jonno amader Try catch use korte hbe
            if (age > 18) {
                System.out.println("You can access this site ;) ");
            } else {
                System.out.println("You are bellow the 18 years .Come here after 28 :P ");
            }
        } catch (InputMismatchException e) {
            System.out.println("please Enter the Int Type Value ");
        }

    }
}
