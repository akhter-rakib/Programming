package basic.jvm;

import java.lang.reflect.Method;

public class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        int count = 0;
        Class c = Class.forName("basic.jvm.Student");
        // Class c = Class.forName("java.lang.String");
        Method[] m = c.getDeclaredMethods();

        for (Method m1 : m) {
            count++;
            System.out.println("Method Name " + m1.getName());
        }
        System.out.println("Number of Method is " + count);
    }
}
