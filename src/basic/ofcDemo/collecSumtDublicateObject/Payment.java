package basic.ofcDemo.collecSumtDublicateObject;

public class Payment {

    private int id;

    private Double paymentMoney;

    private String paymentGiverName;

    public Payment() {
    }

    public Payment(int id, Double paymentMoney, String paymentGiverName) {
        this.id = id;
        this.paymentMoney = paymentMoney;
        this.paymentGiverName = paymentGiverName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public String getPaymentGiverName() {
        return paymentGiverName;
    }

    public void setPaymentGiverName(String paymentGiverName) {
        this.paymentGiverName = paymentGiverName;
    }
}
