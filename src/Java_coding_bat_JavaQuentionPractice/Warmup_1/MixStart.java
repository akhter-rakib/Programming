package Java_coding_bat_JavaQuentionPractice.Warmup_1;

/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false*/
public class MixStart {
    public boolean mixStart(String str) {
        String firstTwoChar;
        if (str.length() < 3)
            return false;
        firstTwoChar = str.substring(1, 3);
        return firstTwoChar.equals("ix");
    }

    public static void main(String[] args) {

    }
}
