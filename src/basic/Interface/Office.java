package basic.Interface;

public class Office implements Plan {
    int rate = 15;

    @Override
    public void getRate(int unit) {
        System.out.println("Office rate is :" + unit * rate);
    }
}
