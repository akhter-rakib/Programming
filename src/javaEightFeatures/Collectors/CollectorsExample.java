package javaEightFeatures.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "rakib", 12));
        customers.add(new Customer(1, "rakib", 1));
        customers.add(new Customer(1, "rakib", 10));
        customers.add(new Customer(1, "rakib", 16));

        Stream<Customer> filtered_data_aboveTwelve = customers.stream().filter(product -> product.price > 12);
        filtered_data_aboveTwelve.forEach(
                localVariable -> System.out.println(localVariable.name + ": " + localVariable.price)
        );


        customers.forEach(
                (price) -> System.out.println(price.price)
        );
        List<Integer> customerPriceList = customers.stream().map(x -> x.price).collect(Collectors.toList());
        System.out.println("All Customer Price List : " + customerPriceList);

        Set<Integer> customerPriceListAsSet = customers.stream().map(x -> x.price).collect(Collectors.toSet());
        System.out.println("All Customer Price List  As Set " + customerPriceListAsSet);


        Double totalPrice = customers.stream().collect(Collectors.averagingDouble(x -> x.price));
        System.out.println("Totall price for Customer " + totalPrice);

        Long countingElement = customers.stream().collect(Collectors.counting());
        System.out.println("Counting Element is " + countingElement);

    }
}
