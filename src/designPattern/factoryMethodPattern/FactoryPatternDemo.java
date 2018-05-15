package designPattern.factoryMethodPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("rectangle");
        shape.draw();
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();
    }
}
