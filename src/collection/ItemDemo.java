package collection;

import java.util.ArrayList;
import java.util.List;

public class ItemDemo {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        List<Item> itemList2 = new ArrayList<>();
        Item item1 = new Item(1, 5, 11);//1
        Item item2 = new Item(2, 2, 1);//2
        Item item3 = new Item(1, 3, 5);//1
        Item item4 = new Item(2, 3, 5);//1
        Item item5 = new Item(2, 3, 5);//1
        Item item6 = new Item(3, 3, 5);//1

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        int[] itemCheck = new int[itemList.size()];
        for (int i = 0; i < itemCheck.length; i++) {
            itemCheck[i] = 0;
        }
        Integer id, qty;
        Double totalAmount;
        for (int i = 0; i < itemList.size(); i++) {
            id = itemList.get(i).getId();
            qty = itemList.get(i).getQty();
            totalAmount = itemList.get(i).getTotalAmount();
            for (int j = i + 1; j < itemList.size(); j++) {
                if (itemList.get(i).getId().equals(itemList.get(j).getId())) {
                    qty += itemList.get(j).getQty();
                    totalAmount += itemList.get(j).getTotalAmount();
                    itemCheck[j] = 1;
                }
            }
            if (itemCheck[i] != 1) {
                Item item = new Item(id, qty, totalAmount);
                itemList2.add(item);
                itemCheck[i] = 1;
            }
        }
        System.out.println(itemList2);
    }
}
