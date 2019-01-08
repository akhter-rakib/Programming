package PyramidAndPattern;

/*https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/*/
public class HalfPyramidByNumber {
    public void halfPyramidNumber(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramidByNumber().halfPyramidNumber(4);
    }
}
