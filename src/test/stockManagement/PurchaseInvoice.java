package test.stockManagement;

import java.util.ArrayList;
import java.util.List;

public class PurchaseInvoice {
    private Integer id;
    private List<PurchaseInvoiceDetails> details =new ArrayList<>();
    private Integer totalDue;
    private Integer totalAmount;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<PurchaseInvoiceDetails> getDetails() {
        return details;
    }

    public void setDetails(List<PurchaseInvoiceDetails> details) {
        this.details = details;
    }

    public Integer getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(Integer totalDue) {
        this.totalDue = totalDue;
    }

    @Override
    public String toString() {
        return "PurchaseInvoice{" +
                "id=" + id +
                ", details=" + details +
                ", totalDue=" + totalDue +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
