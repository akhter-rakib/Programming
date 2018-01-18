package javaEightFeatures;

public class WithLambdaExOne {
    public static void main(String[] args) {
        int width = 120;
        Drawable d2 = () -> {
            System.out.println("Drawing with is :" + width);
        };
        d2.draw();

    }
}
