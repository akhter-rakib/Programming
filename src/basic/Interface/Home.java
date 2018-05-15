package basic.Interface;

public class Home implements Plan {
    int rate = 12;

    @Override
    public void getRate(int unit) {
        System.out.println("home rate is :" + unit * rate);
    }
}
