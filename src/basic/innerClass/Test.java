package basic.innerClass;

public class Test {
    public static void main(String[] args) {
        String b = "a";
        String a = new String("a");


        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        String s1 = "   hello";
        String s2 = "hello";
        String s3=s1.trim();
        System.out.println(s3==s2);
    }
}
