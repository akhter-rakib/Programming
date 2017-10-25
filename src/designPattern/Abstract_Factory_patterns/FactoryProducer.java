package designPattern.Abstract_Factory_patterns;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Shape"))
            return new ShapeFactory();
        else if (choice.equalsIgnoreCase("COLOR"))
            return new ColorFactory();
        return null;
    }
}
