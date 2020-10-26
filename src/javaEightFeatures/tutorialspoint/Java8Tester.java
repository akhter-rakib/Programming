package javaEightFeatures.tutorialspoint;

public class Java8Tester {

    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;

        MathOperation abs = (int a, int b) -> a - b;
        Java8Tester java8Tester = new Java8Tester();
        System.out.println(java8Tester.operate(7, 2, addition));
        System.out.println(java8Tester.operate(7, 2, abs));
    }

   /* interface MathOperation {
        int operation(int a, int b);
    }*/

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
