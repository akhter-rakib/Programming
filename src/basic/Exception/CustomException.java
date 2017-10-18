package basic.Exception;

import java.util.Scanner;

public class CustomException {
    private float currentBalance = 15000f;

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please Enter Amount To add in Your balance ");
        float newAmount = inputDevice.nextFloat();
        try {
            float totalAmount = new CustomException().addAmount(newAmount);
            System.out.println("Total amount Balance is " + totalAmount);
        } catch (AccounBalanceException ab) {
            float fdAmount = ab.getAccountBalance() - 20000;
            System.out.println("You account balance is more than 20k now " +
                    "so creating FB of Amount :" + fdAmount);
            new CustomException().createFixDeposit(fdAmount);
            System.out.println("Account Balance = " + 20000);
        }
    }

    public float addAmount(float amount) throws AccounBalanceException {
        float total = currentBalance + amount;
        if (total > 20000) {
            throw new AccounBalanceException(total);
        }
        return total;
    }

    public void createFixDeposit(float fxAmount) {
        //Implimentation of FD creation
    }
}

class AccounBalanceException extends Exception {
    private float accountBalance;

    public AccounBalanceException(float f) {
        super();
        this.accountBalance = f;
    }

    public AccounBalanceException(String message) {
        super(message);
    }

    public float getAccountBalance() {
        return accountBalance;
    }
}
