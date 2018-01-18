package javaEightFeatures;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        drawable.draw();
    }

}
