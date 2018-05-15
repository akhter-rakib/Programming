package basic.Interface;

public class RateFactor {
    public Plan getRate(String rateType) {
        if (rateType.equalsIgnoreCase("home")) {
            return new Home();
        }
        if (rateType.equalsIgnoreCase("office")) {
            return new Office();
        }
        return null;
    }
}
