package test;

import java.util.Scanner;

public class PrimeNumberDemo {

    public boolean isPrimeOrNot(Integer userGivenvalue) {
        boolean flag = true;
        for (int i = 2; i < userGivenvalue / 2; i++) {
            if (userGivenvalue % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner;
        Integer userValue;
        Boolean flag = true;
        System.out.println("Give a positive number to check Prime or Not");
        scanner = new Scanner(System.in);
        userValue = scanner.nextInt();
        PrimeNumberDemo primeNumberDemo = new PrimeNumberDemo();
        Boolean status = primeNumberDemo.isPrimeOrNot(userValue);

       /* for (int i = 2; i < userValue / 2; i++) {
            if ((userValue % i) == 0) {
                flag = false;
                break;
            }
        }*/
        if (status) {
            System.out.println("Your number " + userValue + " is Prime");
        } else {
            System.out.println("Your number " + userValue + " is Not  Prime");
        }

    }
}
