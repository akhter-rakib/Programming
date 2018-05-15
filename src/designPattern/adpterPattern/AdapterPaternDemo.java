package designPattern.adpterPattern;

/*Client class*/
public class AdapterPaternDemo {
    public static void main(String[] args) {
        CreditCard targetInterFace = new BankCustomer();
        targetInterFace.giveBankDetails();
        System.out.println(targetInterFace.getCreaditCard());
    }
}
