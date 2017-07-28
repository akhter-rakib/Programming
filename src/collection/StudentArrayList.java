package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rakib on 7/28/2017.
 */
public class StudentArrayList {
    public static void main(String[] args) {
        Student ata = new Student(1, 18, "Atuar");
        Student paru = new Student(2, 20, "paru");
        Student soikot = new Student(3, 28, "Soikot");
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(ata);
        al.add(soikot);
        al.add(paru);
        Iterator student = al.iterator();
        while (student.hasNext()) {
            Student st = (Student) student.next();
            System.out.println("Name of the student " + st.getName()   + "Roll " + st.getRolNo() + "Age is " + st.getAge());
        }
    }
}
