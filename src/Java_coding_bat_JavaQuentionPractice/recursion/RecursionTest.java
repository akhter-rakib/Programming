package Java_coding_bat_JavaQuentionPractice.recursion;

public class RecursionTest {
    int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = new RecursionTest().fact(3);
        System.out.println(result);
    }
}
