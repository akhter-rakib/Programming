package javaEightFeatures.lambdaExpression;

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        Integer width = 10;
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };

        d2.draw();
    }
}
