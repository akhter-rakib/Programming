package test.loop;

import java.util.Scanner;

public class WhileLoopApps {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String userGiveValue;
        userGiveValue = scanner.next();
        int firstIndx = scanner.nextInt();
        while (userGiveValue.length() < firstIndx) {
            System.out.println("please give index between 0" + userGiveValue.length());
            firstIndx = scanner.nextInt();
        }
    }
}
