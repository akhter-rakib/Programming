package Java_coding_bat_JavaQuentionPractice.recursion;

public class RecursiveByForLoop {

    static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int factWhile(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = factWhile(5);
        System.out.println(num);
    }
}
