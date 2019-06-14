package basic.pyramid;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        System.out.println("How many Row do you want to print the pyramid ?");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
