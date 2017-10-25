package designPattern.Abstract_Factory_patterns;
/*Create an Abstract class to get factories for Color and Shape Objects.*/
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

}
