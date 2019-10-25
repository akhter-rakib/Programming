package Java_coding_bat_JavaQuentionPractice.recursion;

/*We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    bunnyEars(0) → 0
        bunnyEars(1) → 2
        bunnyEars(2) → 4*/
public class BunnyEars {

    int bunnyEars(int n) {
        // return n * 2;
        if (n == 0) {
            return 0;
        } else {
            int b =  bunnyEars(n - 1);
            int p = 2 +b;
            return p;
        }
    }

    public static void main(String[] args) {
        int totalEars = new BunnyEars().bunnyEars(3);
        System.out.println(totalEars);
    }
}
