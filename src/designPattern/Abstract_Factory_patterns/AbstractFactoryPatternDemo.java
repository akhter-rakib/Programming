package designPattern.Abstract_Factory_patterns;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //GET AN OBJECT OF SHAPE CIRCLE
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();
        //GET AN OBJECT OF RECTANGLE
        Shape shapeRectangle = shapeFactory.getShape("Rectanlge");
        shapeRectangle.draw();
        //to get collor
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.gerColor("Red");
        red.fill();
        Color blue = colorFactory.gerColor("Blue");
        blue.fill();
    }
}
