package Java_coding_bat_JavaQuentionPractice.Warmup_1;

/*Given a string, return a new string where the first and last chars have been exchanged.*/
public class FrontBack {
    public String frontBack(String str) {
        if (str.length() < 1)
            return str;
        String midValue = str.substring(1, str.length() - 1);
        return String.valueOf(str.length() - 1) + midValue + str.charAt(0);
    }

    public static void main(String[] args) {
        String strValue = new FrontBack().frontBack("code");
    }
}
