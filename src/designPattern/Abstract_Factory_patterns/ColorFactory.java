package designPattern.Abstract_Factory_patterns;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null)
            return null;
        if (color.equalsIgnoreCase("Red"))
            return new Red();
        else if (color.equalsIgnoreCase("Greem"))
            return new Green();
        else if (color.equalsIgnoreCase("Blue"))
            return new Blue();
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
