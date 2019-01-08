package PyramidAndPattern;

import java.util.Scanner;

/*https://www.programiz.com/java-programming/examples/pyramid-pattern*/
public class HalfPyramid {
    public void printStar(int n) {
        int i, j;
        /*outer loop to handle number of rows*/
        for (i = 0; i < n; i++) {
          /* inner loop to handle number of columns*/
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            /*ending line after each row*/
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner rowLimit = new Scanner(System.in);
        System.out.println("give the Row limitation");
        int n = rowLimit.nextInt();
        new HalfPyramid().printStar(n);
    }
}
