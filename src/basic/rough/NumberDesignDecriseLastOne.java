package basic.rough;

public class NumberDesignDecriseLastOne {


    public static void main(String[] args) {
        for (int j = 0; j <= 5; j++) {
            for (int i = 0; i <= 5-j; i++) {
                System.out.print(" " + i + " ");
            }
            System.out.println('\n');
        }
    }
}
