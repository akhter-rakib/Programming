package String;

public class StringComparism {
    public static void main(String[] args) {
        String a = "man";
        String b = "man";
        System.out.println("equal method is used for contant compariasm");
        System.out.println(a.equals(b));
        //The String equals() method compares the original content of the string.
        // It compares values of string for equality.
        String s1 = "Khan";
        String s2 = "Khan";
        String s3 = new String("Khan");
        System.out.println("= = operator compares references not values. ");
        System.out.println(s1 == s2);//the refer the same value that is stored String constant pool
        System.out.println(s1 == s3);//false because == used for reference check
        String p1 = "Sachin";
        String p2 = "Sachin";
        String p3 = "Ratan";
        System.out.println(p1.compareTo(p2));//0
        System.out.println(p1.compareTo(p3));//1(because p1>p3)
        System.out.println(p3.compareTo(p1));//-1(because p3 < p1 )

    }
}
