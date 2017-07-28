package collection;

/**
 * Created by Rakib on 7/28/2017.
 */
public class Student {
    int rolNo;
    String name;
    int age;

    public Student() {
    }

    public Student(int rolNo, int age, String name) {
        this.rolNo = rolNo;
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRolNo() {
        return rolNo;
    }

    public void setRolNo(int rolNo) {
        this.rolNo = rolNo;
    }
}
