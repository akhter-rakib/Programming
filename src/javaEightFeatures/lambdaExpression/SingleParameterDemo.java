package javaEightFeatures.lambdaExpression;

public class SingleParameterDemo {
    public static void main(String[] args) {
        int width = 100;
        DrawableSingleParameter s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.name("rakib hasan"));

        // You can omit function parentheses
        DrawableSingleParameter s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.name("Sonoo"));


        DrawableSingleParameter drawableSingleParameter = new DrawableSingleParameter() {
            @Override
            public String name(String name) {
                return name;
            }
        };
        drawableSingleParameter.name("Hazzza");


        DrawableSingleParameter dr = (opss) -> {
            return "t";
        };
    }
}
