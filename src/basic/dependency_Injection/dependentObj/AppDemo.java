package basic.dependency_Injection.dependentObj;

import basic.dependency_Injection.dependentObj.Customer;

public class AppDemo {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        customer1.getService();
        customer2.getService();
        customer3.getService();

    }
}
