package basic.JavaInheritance;

public class Programmer extends Employee {
    private Integer bonus = 2500;

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println("Programmer will get "
                + programmer.salary + programmer.bonus);

    }
}
