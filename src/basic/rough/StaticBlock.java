package basic.rough;

import java.util.Scanner;

public class StaticBlock {
    static int B, H;
    static Boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a value first");
        B = scanner.nextInt();
        System.out.println("Give a value second");
        Scanner scanner1 = new Scanner(System.in);
        H = scanner1.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
