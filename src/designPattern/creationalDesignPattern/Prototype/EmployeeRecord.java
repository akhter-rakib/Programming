package designPattern.creationalDesignPattern.Prototype;

public class EmployeeRecord implements Prototype {
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord() {
    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord() {
        System.out.println("Id = " + id + "\t name  = " + name + "\t designation =" + designation +
                "\t salary = " + salary + "\t address =" + address);
    }

    public EmployeeRecord getAll(){
        return new EmployeeRecord(id, name, designation, salary, address);
    }
    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }
}
