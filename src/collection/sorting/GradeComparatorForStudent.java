package collection.sorting;

import java.util.Comparator;

public class GradeComparatorForStudent implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
        //return o1.getGrade() - o2.getGrade();
    }
}
