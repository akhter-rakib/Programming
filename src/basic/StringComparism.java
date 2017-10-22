package basic;

public class StringComparism {

    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "12";
        int var1 = str1.compareTo(str2);
        int var2 = str2.compareTo(str1);
        if (var1 < 0) {
            System.out.println("Var one is less than variable 2 ");
        } else if (var1 > 0) {
            System.out.println("Variable one is bigger than variable two ");
        } else if (var1 == var2) {
            System.out.println("These two value are same");
        }

    }
}
