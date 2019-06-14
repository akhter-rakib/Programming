package basic.rough;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer temp, reversedNumber = 0;
        while (number != 0) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;

        }
        System.out.println(reversedNumber);
    }

}
