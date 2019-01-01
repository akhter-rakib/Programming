package Java_coding_bat_JavaQuentionPractice.Warmup_1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        boolean status = false;
        if (negative) {
            if (a < 0 && b < 0)
                status = true;
        } else {
            if (a > 0 && b < 0 || a < 0 && b > 0)
                status = true;
        }
        return status = false;
    }

    public static void main(String[] args) {

    }
}
