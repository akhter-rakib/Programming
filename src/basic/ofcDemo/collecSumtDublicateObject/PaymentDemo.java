package basic.ofcDemo.collecSumtDublicateObject;

import java.util.*;

public class PaymentDemo {
    public static void €main(String[] args) {
        List<Payment> list = new ArrayList<>();
        Payment payment = new Payment(1, 12.10, "rana");
        Payment payment2 = new Payment(2, 13.00, "kobir");
        Payment payment3 = new Payment(1, 12.10, "rana");
        Payment payment4 = new Payment(1, 12.10, "rana");
        Payment payment5 = new Payment(2, 4.5, "kobir");
        list.add(payment);
        list.add(payment2);
        list.add(payment3);
        list.add(payment4);
        list.add(payment5);

        ArrayList<Integer> arrayList = new ArrayList();
        Set s = new HashSet();
        for (Payment p : list) {
            s.add(p.getId());
        }
        for (Payment p : list) {
            Iterator<Integer> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                Integer value = iterator.next();
                if(value == p.getId()){

                }
            }
        }

    }
}
