package basic.ofcDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjUpdate {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        Product p1 = new Product(1, "first", "monitor", 4);
        Product p2 = new Product(1, "second", "monitor", 3);
        Product p3 = new Product(1, "third", "monitor", 10);
        Product p4 = new Product(1, "four", "monitor", 1);
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        System.out.println("Give your required value");
        Scanner scanner = new Scanner(System.in);
        Integer userValue = scanner.nextInt();

        for (Product p : productList) {
            if (userValue == 0) {
                break;
            }
            if (p.getQuatity() >= userValue) {
                p.setQuatity(p.getQuatity() - userValue);
                userValue = 0;

            } else {
                userValue = userValue - p.getQuatity();
                p.setQuatity(0);
            }
        }
        productList.forEach(p -> System.out.println(p.getQuatity()));
    }
}
