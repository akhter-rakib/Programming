package designPattern.Facade;

/*ShapeMaker class uses the concrete classes to delegate(protindihi) user calls to these classes.*/
public class ShapeMaker {
    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeMaker() {
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void draqRectangle() {
        rectangle.drow();
    }

    public void drawSquare() {
        square.drow();
    }

    public void drawCircle() {
        circle.drow();
    }
}
