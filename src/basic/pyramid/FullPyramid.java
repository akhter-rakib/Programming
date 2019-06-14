package basic.pyramid;

import java.util.Scanner;

public class FullPyramid {

    public static void main(String[] args) {
        System.out.println("How many rows do you want to print in the pyramid ?");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        // outer loop to handle number of rows
        //  row in this case
        for (int i = 0; i < row; i++) {
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = row - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }
    }
}
