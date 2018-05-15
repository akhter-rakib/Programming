package designPattern.adpterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Adapter class*/
public class BankCustomer extends BankDetails implements CreditCard {


    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Account Holder Name :");
            String customerName = br.readLine();
            System.out.println("Enter the account number : ");
            long accno = Long.parseLong(br.readLine());
            System.out.println("Enter the bank name : ");
            String bankName = br.readLine();
            //set the value into method of bankDetails class.
            setAccHolderName(customerName);
            setAccountNumber(accno);
            setBankName(bankName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreaditCard() {
        long accno = getAccountNumber();
        String accHolderName = getAccHolderName();
        String bname = getBankName();
        return ("The Account number " + accno + "of " + accHolderName + " in " + bname + " " +
                " bank is valid and authenticated for issuing the creadit card");
    }
}
