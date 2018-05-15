package test.stockManagement;

import java.util.ArrayList;
import java.util.List;

public class PurchaseInvoiceDetails {

    private Integer id;
    private List<Item> items=new ArrayList<>();
    private Integer qty;
    private Integer unitRate;
    private Integer totalAmount;
    private List<PurchaseInvoice> invoices=new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getUnitRate() {
        return unitRate;
    }

    public void setUnitRate(Integer unitRate) {
        this.unitRate = unitRate;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<PurchaseInvoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<PurchaseInvoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "PurchaseInvoiceDetails{" +
                "id=" + id +
                ", items=" + items +
                ", qty=" + qty +
                ", unitRate=" + unitRate +
                ", totalAmount=" + totalAmount +
                ", invoices=" + invoices +
                '}';
    }
}
