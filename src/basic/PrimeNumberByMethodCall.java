package basic;

import java.util.Scanner;

public class PrimeNumberByMethodCall {

    public boolean isPrime(Integer userValue) {
        boolean flag = true;
        for (int i = 2; i < userValue / 2; i++) {
            if (userValue % i == 0) {
                flag = false;
                break;
                //we can not direct return a true and false from here after using break
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give ur number to check Prime or no ");
        Integer userValue = scanner.nextInt();
        PrimeNumberByMethodCall callMethod = new PrimeNumberByMethodCall();
        boolean isprimeOrNot = callMethod.isPrime(userValue);
        System.out.println(isprimeOrNot);
        System.out.println((isprimeOrNot) ? "Ur number " + userValue + " Is Prime "
                : " Ur number " + userValue + " is not Prime ");


    }
}
