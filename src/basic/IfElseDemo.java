package basic;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Integer testScore;
        String grade = "";
        System.out.println("Give the Score Plz");
        Scanner scanner = new Scanner(System.in);
        testScore = scanner.nextInt();
        if (testScore >= 80 && 100 >= testScore) {
            grade = "A+";
        } else if (testScore >= 70 && 80 > testScore) {
            grade = "A";
        } else if (testScore >= 60 && 70 > testScore) {
            grade = "B+";
        } else {
            System.out.println("Sorry You are Fail");
        }
        System.out.println("Your result grade is " + grade);
    }
}
