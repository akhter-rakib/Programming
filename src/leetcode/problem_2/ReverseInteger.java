package leetcode.problem_2;

/*iven a 32-bit signed integer, reverse digits of an integer.*/
public class ReverseInteger {
    public static void main(String[] args) {
        Integer input = -134;
        long rev = 0;
        while (input != 0) {
            rev = rev * 10 + input % 10;
            input = input / 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                System.out.println("Its okay Boss");
            }
        }
        System.out.println(rev);
    }
}
