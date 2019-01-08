package Java_coding_bat_JavaQuentionPractice.Warmup_1;

/*Given two int values, return their sum. Unless the two values are the same,
        then return double their sum.
        sumDouble(1, 2) → 3
        sumDouble(3, 2) → 5
        sumDouble(2, 2) → 8*/
public class SumDouble {
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b)
            sum = 2 * sum;
        return sum;
    }

    public static void main(String[] args) {

    }
}

