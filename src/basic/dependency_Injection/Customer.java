package basic.dependency_Injection;

public class Customer {
    private Service service;
    private String customerName;

    public Customer(Service service, String customerName) {
        this.service = service;
        this.customerName = customerName;
    }

    public Service getService() {
        return service;
    }

    public String getCustomerName() {
        System.out.println(customerName);
        return customerName;
    }
}
