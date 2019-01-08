package Java_coding_bat_JavaQuentionPractice.Warmup_1;

/*Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
        Use the % "mod" operator*/
public class Or35 {
    public boolean or35(int number) {
        return number % 5 == 0 || number % 3 == 0;
    }

    public static void main(String[] args) {
        boolean number = new Or35().or35(35);
        System.out.println(number);
    }
}
