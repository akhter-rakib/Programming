package Java_coding_bat_JavaQuentionPractice.logic_1;

/*Given two ints, each in the range 10..99, return true if there is a digit that appears
        in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives
        the left digit while the % "mod" n%10 gives the right digit.)
        shareDigit(12, 23) → true
        shareDigit(12, 43) → false
        shareDigit(12, 44) → false*/
public class ShareDigit {

    public boolean shareDigit(int a, int b) {
        boolean status = false;
        if (!(10 <= a) && (a <= 99) || !(10 <= b) && (b <= 99)) {
            status = false;
        }
        if ((a / 10 == b / 10 || a / 10 == b % 10) || (a % 10 == b / 10 || a % 10 == b % 10)) {
            status = true;
        }
        return status;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        ShareDigit shareDigit = new ShareDigit();
        boolean status = shareDigit.shareDigit(a, b);
        System.out.println(status);


    }
}
