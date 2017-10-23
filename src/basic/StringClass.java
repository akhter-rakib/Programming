package basic;

public class StringClass {
    public static void main(String[] args) {
        String s = "ABC";
        int length = s.length();
        char[] chars = s.toCharArray();//String k khub sohoje character array te convert kora jai
        for (int i = 0; i < length; i++) {
            System.out.println(chars[i]);
        }
    }
}
