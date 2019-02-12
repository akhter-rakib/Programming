package Java_coding_bat_JavaQuentionPractice.Warmup_1;

public class EndUp {
    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String cutString = str.substring(str.length() - 3);
        return (front + cutString).toUpperCase();
    }

    public static void main(String[] args) {
        String endUP = new EndUp().endUp("Hell0 rak");
        System.out.println(endUP);
    }
}
