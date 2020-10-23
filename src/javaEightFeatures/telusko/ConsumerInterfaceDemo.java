package javaEightFeatures.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer> {

    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 8, 90);
        Consumer<Integer> consumers = (i) -> System.out.println(i);

        /*Consumer<Integer> consumer = new ConsumerImpl();
        list.forEach(consumer);*/

        for (Integer i : list) {
            consumers.accept(i);
        }

        list.forEach(i -> {
            if (i == 4) {
                System.out.println("Rakib Bepari");
            }
        });


    }

    ;
}
