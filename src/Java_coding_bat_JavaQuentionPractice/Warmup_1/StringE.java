package Java_coding_bat_JavaQuentionPractice.Warmup_1;

/*Return true if the given string contains between 1 and 3 'e' chars.*/
public class StringE {
    public boolean stringE(String str) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            char cr = str.charAt(i);
            if (cr == 'e') {
                a = a + 1;
            }
        }
        return (a >= 1 && a <= 3);
    }

    public static void main(String[] args) {
        StringE stringE = new StringE();
        stringE.stringE("Hello");
        stringE.stringE("Hlllo");
    }
}
