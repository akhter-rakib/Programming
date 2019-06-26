package javaEightFeatures.lambdaExpression;

public class MultipleParameterDemo {
    public static void main(String[] args) {
        Addable addable = (a, b) -> {
            return a + b;
        };
        Addable ad = (Integer a, Integer b) -> {
            return a + b;
        };
    }
}
