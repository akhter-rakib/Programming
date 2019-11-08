package basic.rough;

//We can use == operators for reference comparison (address comparison) and
// .equals() method for content comparison. In simple words, == checks if both objects
// point to the same memory location whereas .equals() evaluates
// to the comparison of values in the objects
public class DoubleEqualAndMethod {
    public static void main(String[] args) {

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        String s = "Aman";
        String s2 = "Aman";
        String s3 = new String("Aman");
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s == s3);
        System.out.println(t3 == t1);
    }
}
