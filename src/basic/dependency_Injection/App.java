package basic.dependency_Injection;

public class App {
    public static void main(String[] args) {
        Service service = new Service("Cool Service");
        Service service2 = new Service("Hot Service");
        Service service3 = new Service("Mad Service");

        Customer customer = new Customer(service, "Hasan");
        Customer customer2 = new Customer(service2, "Khan");
        Customer customer3 = new Customer(service3, "Kobir");

        customer.getService();
        customer.getCustomerName();

        customer2.getService();
        customer2.getCustomerName();

        customer3.getService();
        customer3.getCustomerName();
    }
}
