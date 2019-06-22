package test;

public class App {

    public static void main(String[] args) {
        Service service = new Service("Hot Service");
        Service service2 = new Service("Mad Service");
        Service service3 = new Service("Cool Service");

        Customer customer = new Customer(service);
        Customer customer2 = new Customer(service2);
        Customer customer3 = new Customer(service3);

        System.out.println(customer.getCustomerName());
        System.out.println(customer.getService().getName());

    }
}
