package designPattern.Facade;

public class Circle implements Shape {
    @Override
    public void drow() {
        System.out.println("Circle::draw()");
    }
}
