package basic.jvm;

public class Test {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(Test.class.getClassLoader());
        System.out.println(basic.jvm.Customer.class.getClassLoader());
    }
}
