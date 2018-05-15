package javaEightFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//https://www.mkyong.com/java8/java-8-streams-filter-examples/
public class StreamFilterDemo {
    public static void main(String[] args) {
        List<ProductModel> productsList = new ArrayList<ProductModel>();

        productsList.add(new ProductModel(1, "HP Laptop", 25000f));
        productsList.add(new ProductModel(2, "Dell Laptop", 30000f));
        productsList.add(new ProductModel(3, "Lenevo Laptop", 28000f));
        productsList.add(new ProductModel(4, "Sony Laptop", 28000f));
        productsList.add(new ProductModel(1, "Apple Laptop", 90000f));

        Stream<ProductModel> po = productsList.stream().filter(p -> p.id != 1);
        po.forEach(p -> System.out.println(p.name));
    }
}
