package basic.pyramid;

import java.util.Scanner;

public class HalfPyramidWithStaric {
    public static void main(String[] args) {

        System.out.println("How much row will be in pyramid");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
