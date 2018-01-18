package javaEightFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteCollectionData {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        List<Product> productsupTwelve = new ArrayList<Product>();

        products.add(new Product(1, "rakib", 12.1));
        products.add(new Product(2, "hasan", 2.3));
        products.add(new Product(3, "khan", 16.3));
        products.add(new Product(4, "jaman", 1.1));
        products.add(new Product(5, "Hello", 2.2));

       /* for (Product product : products) {
            if (product.price > 12) {
                productsupTwelve.add(product);
            }
        }

        for(Product product : productsupTwelve){
            System.out.println("Only above 12 " + product.name);
        }*/

        Stream<Product> filtered_data_aboveTwelve = products.stream().filter(product -> product.price > 12);

        filtered_data_aboveTwelve.forEach(
                localVariable -> System.out.println(localVariable.name+": "+localVariable.price)
        );
    }


}
