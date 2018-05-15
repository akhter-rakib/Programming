package test.stockManagement;

import java.util.ArrayList;
import java.util.List;

public class DemoInventory {
    public static void main(String[] args) {
        PurchaseInvoice purchaseInvoice = new PurchaseInvoice();
        purchaseInvoice.setId(1);
        purchaseInvoice.setTotalAmount(12);
        purchaseInvoice.setTotalDue(23);
        List<PurchaseInvoiceDetails> details = new ArrayList<PurchaseInvoiceDetails>();
        PurchaseInvoiceDetails det = new PurchaseInvoiceDetails();
        det.setId(1);
        det.setQty(3444);
        det.setTotalAmount(123);
        det.setUnitRate(32);
        List<Item> item = new ArrayList<Item>();
        Item itm = null;
        for (int i = 1; i < 3; i++) {
            itm = new Item();
            itm.setId(1);
            itm.setName("Name" + i);
            item.add(itm);
        }
        det.setItems(item);
        details.add(det);
        purchaseInvoice.setDetails(details);

        System.out.println(purchaseInvoice.toString());

        purchaseInvoice.getDetails().iterator().next().getItems().iterator().next().getName();

        System.out.println(purchaseInvoice.getDetails().iterator().next().getItems().iterator().next().getName());

    }
}
