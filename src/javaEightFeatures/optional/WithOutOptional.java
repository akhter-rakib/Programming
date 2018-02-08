package javaEightFeatures.optional;

import java.util.ArrayList;

public class WithOutOptional {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] values = new String[10];
        String loweCaseValue = values[3].toLowerCase();
        System.out.println("******"+loweCaseValue);
    }
}
