package javaEightFeatures;

public class Test implements Drawable {
    @Override
    public void draw() {
        System.out.println("How are you ? ");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.draw();
    }


}
