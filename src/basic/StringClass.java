package basic;

public class StringClass {
    public static void main(String[] args) {
        String s = "ABC";
        int length = s.length();
        char[] chars = s.toCharArray();//String k khub sohoje character array te convert kora jai
        for (int i = 0; i < length; i++) {
            System.out.println(chars[i]);
        }
        String name = "MohammadRakibBepary";
        System.out.println(name.substring(8));//5 no index ar porer value gula print hobe
        System.out.println(name.substring(3, 6));//index 3 theke 6 ar modhe value print hobe
    }
}
