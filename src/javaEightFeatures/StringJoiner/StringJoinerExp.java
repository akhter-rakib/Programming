package javaEightFeatures.StringJoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExp {

    public static void main(String[] args) {
        //create String by literal way
        String name = "rakib";
        String anothername = "rakib";//jvm will check rakib is in the memory or not if yes it will not crete another rakib just
        //refer this name to anothername :) it is the benefit to create string by literal way
        System.out.println("Name is " + name);
        List<String> names = new ArrayList<>();
        names.add("rakib");
        names.add("hasan");
        names.add("hamza");
        System.out.println("All name list is : " + names);

        //StringJoiner
        StringJoiner joinName = new StringJoiner(",");
        joinName.add("jaman");
        joinName.add("aman");
        joinName.add("hira");
        System.out.println("String Joiner used to add new name add " + joinName);

        StringJoiner joinNames = new StringJoiner(",", "[", "]");
        // passing comma(,) and square-brackets as delimiter
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");
        System.out.println("with Prefix and Suffix by StringJoiner " + joinNames);


    }
}
