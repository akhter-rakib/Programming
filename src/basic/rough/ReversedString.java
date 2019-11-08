package basic.rough;

public class ReversedString {
    public static void main(String[] args) {
        String s = "MadaM";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        if(s.equals(rev)){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}
