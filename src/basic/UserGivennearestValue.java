package basic;

import java.util.Scanner;

public class UserGivennearestValue {
    //18 given out put will be 20 , 16 given will be 15
    public static Integer nearValue(Integer userGivenValue) {
        Integer restValue = userGivenValue % 5;
        if (restValue >= 3) {
            return (userGivenValue + 5) - restValue;
        } else {
            return userGivenValue - restValue;
        }

    }

    public static void main(String[] args) {

        System.out.println("Please give a number ");
        Scanner scanner = new Scanner(System.in);
        Integer userGivenValue = scanner.nextInt();
        Integer result = nearValue(userGivenValue);
        System.out.println("Your Neares 5 multiple value is " + result);
    }
}
