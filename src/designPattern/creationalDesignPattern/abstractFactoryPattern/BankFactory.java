package designPattern.creationalDesignPattern.abstractFactoryPattern;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if(bank.equalsIgnoreCase("ICIC BANK")){
            return new ICICI();
        }else if (bank.equalsIgnoreCase("HDFC BANK")){
            return new HDFC();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
