import java.util.Scanner;

/**
 * Created by Rakib on 7/28/2017.
 */
public class OddEvenProgram {
    public static void main(String[] args) {
        Scanner numOne = new Scanner(System.in);
        System.out.println("Give Ur First No : ");
        int a = numOne.nextInt();
        if (a % 2 == 0) {
            System.out.println("ur Guven Value" + a + "is a Even Number ");
        } else {
            System.out.println("Ur value is" + a + "Odd Value ");
        }
    }
}
