package hackerrank;

import java.util.Scanner;

public class MultipleGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give a number");
        Integer value = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(value + "*" + i + "=" + value * i);
        }
    }
}
