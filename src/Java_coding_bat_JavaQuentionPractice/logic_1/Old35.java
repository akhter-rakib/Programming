package Java_coding_bat_JavaQuentionPractice.logic_1;

/*Return true if the given non-negative number is a multiple of 3 or 5,
        but not both. Use the % "mod" operator -- see Introduction to Mod*/
public class Old35 {
    public boolean old35(int n) {
        boolean status = false;
        if (n > 0) {
            if (n % 3 == 0 || n % 5 == 0) {
                status = true;
            }
            if ((n % 3 == 0 && n % 5 == 0)) {
                status = false;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        boolean status = new Old35().old35(15);
        System.out.println(status);
    }
}
