package basic;

public class StudentApp {

    public static void main(String[] args) {
        String name = "rakib";
        int roll = 12;
       // Student student = new Student(name, roll);
        Student student = new Student();
        student.setName(name);
        student.setRoll(roll);
        System.out.println("Student Name " + student.getName());
        System.out.println("Student Roll " + student.getRoll());
    }
}
