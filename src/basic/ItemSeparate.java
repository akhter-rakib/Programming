package basic;

import collection.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemSeparate {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item(1, 5, 11.2);
        Item item2 = new Item(2, 2, 110.2);
        Item item3 = new Item(1, 3, 10.2);
        Item item4 = new Item(2, 3, 10.2);
        Item item5 = new Item(3, 3, 16.2);
        Item item6 = new Item(1, 3, 16.2);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        List<Integer> ids = itemList.stream().map(sinItem -> sinItem.getId()).collect(Collectors.toList());
        List<Integer> uniqueIds = ids.stream().distinct().collect(Collectors.toList());
        uniqueIds.forEach(id -> {
            Item summaryItem = provideItemSummary(id, itemList);
            System.out.println(summaryItem.toString());
        });
    }

    public static Item provideItemSummary(int id, List<Item> items) {
        List<Item> singleItems = items.stream().filter(item -> item.getId().equals(id)).collect(Collectors.toList());
        int qty = 0;
        double totalAmount = 0;
        Item item = new Item();
        for (Item singleItem : singleItems) {
            qty += singleItem.getQty();
            totalAmount += singleItem.getTotalAmount();
        }
        item.setId(id);
        item.setQty(qty);
        item.setTotalAmount(totalAmount);
        return item;

    }
}
