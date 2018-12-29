package basic.JavaInheritance;

public class Emp {
    private int id;
    private String name;
    private Address address;//Employee HAS-A address

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void disPlay() {
        System.out.println("Employee name is " + name);
        System.out.println(address.city + " State->" + address.state + " City->" + address.city);
    }

    public static void main(String[] args) {
        Address address = new Address("Dhaka", "Razdhani", "Bangladesh");
        Address address1 = new Address("Khulna", "Bivag", "Bangladesh");
        Emp emp = new Emp(1, "Rakib", address);
        Emp emp2 = new Emp(2, "Hasan", address1);
        emp.disPlay();
        emp2.disPlay();
    }

}
