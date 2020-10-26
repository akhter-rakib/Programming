package collection.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println(vector);
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer i = (Integer) enumeration.nextElement();
            if (i % 2 == 0) {
                System.out.println("Even Value between 0 t0 10 is : " + i);
            }
            // System.out.println(enumeration.nextElement());
        }
    }
}
