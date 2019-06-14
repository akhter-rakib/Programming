package basic.pyramid;

import java.util.Scanner;

public class SpaceConfigure {
    public static void main(String[] args) {

        System.out.println("Row number");
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
