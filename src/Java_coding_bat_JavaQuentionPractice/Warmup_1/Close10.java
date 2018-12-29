package Java_coding_bat_JavaQuentionPractice.Warmup_1;

/*Given 2 int values, return whichever value is nearest
        to the value 10, or return 0 in the event of a tie.
        Note that Math.abs(n) returns the absolute value of a number.
        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0*/
public class Close10 {
    public int near10(int a, int b) {
        int c = Math.abs(10 - a);
        int d = Math.abs(10 - b);
        if (c > d) {
            return b;
        } else if (d > c) {
            return a;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Integer ab = new Close10().near10(18, 2);
        System.out.println("*********Nearest One is *********** " + ab);
    }
}
