package designPattern.creationalDesignPattern.abstractFactoryPattern;

public class ICICI implements Bank {
    private final String ICICName;

    public ICICI() {
        ICICName = "ICIC BANK";
    }

    @Override
    public String getBankName() {
        return ICICName;
    }
}
