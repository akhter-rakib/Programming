package javaEightFeatures.lambdaExpression.withoutLamda;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        Integer width = 10;
        Drawable drawable = new Drawable() {
            public void draw() {
                System.out.println("Drawing" + width);
            }
        };
        drawable.draw();
    }
}
