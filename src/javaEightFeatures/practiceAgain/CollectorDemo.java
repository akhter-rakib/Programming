package javaEightFeatures.practiceAgain;

import java.util.ArrayList;
import java.util.List;

public class CollectorDemo {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Botol", 12.90));
        list.add(new Product(2, "Glass", 1.90));
        list.add(new Product(3, "Freeze", 100.90));
        list.add(new Product(4, "Potato", 2.90));

        list.forEach(System.out::println);
    }
}
