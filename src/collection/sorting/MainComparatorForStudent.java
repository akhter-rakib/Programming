package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparatorForStudent {
    public static void main(String[] args) {
        Student student1 = new Student("rakib", 12, "lessom", 1);
        Student student2 = new Student("khan", 1, "nai", 2);
        Student student3 = new Student("jasim", 12, "lessom", 4);
        Student student4 = new Student("mullah", 5, "porbona", 6);
        ArrayList<Student> std = new ArrayList();
        std.add(student1);
        std.add(student2);
        std.add(student3);
        std.add(student4);
        System.out.println("order of Student before Sorting ");
        for (Student s : std) {
            System.out.println(s.getName() + " " + s.getGrade());
        }
        System.out.println("Sorting By Name ");
        Collections.sort(std, new GradeComparatorForStudent());
        System.out.println("After sorting ");
        for (Student s : std) {
            System.out.println(s.getName() + " " + s.getGrade());
        }


    }
}
