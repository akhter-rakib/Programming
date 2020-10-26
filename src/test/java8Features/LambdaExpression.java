package test.java8Features;

interface A {
    void add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        A obj = (a, b) -> System.out.println("The Sum is " + a + b);
        /* lambda expressions are a way to implement interfaces without making a new class*/
        /*lambda expressions only work with interface implementing only 1 method which is called a functional interface*/
        obj.add(4,8);

    }
}
