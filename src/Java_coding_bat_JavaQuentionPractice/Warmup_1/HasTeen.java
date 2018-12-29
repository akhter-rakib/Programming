package Java_coding_bat_JavaQuentionPractice.Warmup_1;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return ((a > 13 && a < 19) || (b > 13 && b < 19)
                || (c > 13 && c < 19));
    }

    public static void main(String[] args) {
        HasTeen hasTeen = new HasTeen();
        boolean teen = hasTeen.hasTeen(12, 11, 14);
        System.out.println(teen);
    }
}
