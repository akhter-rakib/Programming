package javaEightFeatures.optional;

import java.util.Optional;

public class OptionalOne {
    public static void main(String[] args) {
        String[] names = new String[10];
        Optional<String> checknull = Optional.ofNullable(names[3]);
        if (checknull.isPresent()) {
            String toLowerCaseValue = names[3].toLowerCase();
            System.out.println("" + toLowerCaseValue);
        } else {
            System.out.println("String Value is not Present");
        }
        //filter way
        names[5] = "Hello Optional";
        Optional<String> fifthValue = Optional.of(names[5]);
        System.out.println(fifthValue.filter(s -> s.equalsIgnoreCase("Hello Optional")));

    }
}
//should read Also https://www.mkyong.com/java8/java-8-optional-in-depth/