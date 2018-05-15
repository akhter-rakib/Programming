package basic;

public class ProductModel {
    private Integer id;
    private Integer qty;
    private Double totalAmount;

    public ProductModel(Integer id, Integer qty, Double totalAmount) {
        this.id = id;
        this.qty = qty;
        this.totalAmount = totalAmount;
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

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", qty=" + qty +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
