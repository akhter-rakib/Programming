package test;

public class Customer {

    private String customerName;
    private Service service;

    public Customer(Service service) {
        this.service = service;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Service getService() {
        return service;
    }
}
