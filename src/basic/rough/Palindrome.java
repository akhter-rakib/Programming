package basic.rough;

public class Palindrome {
    static boolean isPalindrome(Integer val) {

        Integer mainValue = val;
        boolean status;
        Integer reversedNumber = 0, rem;
        while (val != 0) {
            rem = val % 10;
            reversedNumber = reversedNumber * 10 + rem;
            val /= 10;
        }

        if (reversedNumber == mainValue) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public static void main(String[] args) {
        boolean reverseValue = isPalindrome(-121);
        System.out.println(reverseValue);
    }
}
