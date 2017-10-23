package designPattern.Facade;

import designPattern.Facade.Shape;

public class Square implements Shape {
    @Override
    public void drow() {
        System.out.println("Square::draw()");
    }
}
