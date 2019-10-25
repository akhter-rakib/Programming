package basic.jvm;

public class ImmutableClassClassObject {
    public static void main(String[] args) {

        Student student = new Student();
        Class c1 = student.getClass();
        Student student1 = new Student();
        Class c2 = student1.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println("T - " + student.hashCode());
        System.out.println("O - " + student1.hashCode());

    }
}
