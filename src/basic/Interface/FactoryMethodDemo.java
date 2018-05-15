package basic.Interface;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        RateFactor rateFactor = new RateFactor();
        Plan plan = rateFactor.getRate("home");
        plan.getRate(12);
        Plan plan1 = rateFactor.getRate("office");
        plan1.getRate(12);
    }
}
