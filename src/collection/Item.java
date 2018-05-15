package collection;

public class Item {
    private Integer id;
    private Integer qty;
    private double totalAmount;

    public Item(Integer id, Integer qty, double totalAmount) {
        this.id = id;
        this.qty = qty;
        this.totalAmount = totalAmount;
    }

    public Item() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Qty: " + qty + " Total: " + totalAmount;
    }
}
