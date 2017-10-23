package designPattern.Facade;

public class FacadePatternDemo {/*Facade pattern hides the complexities of the system and provides an interface to
        the client using which the client can access the system.*/

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.draqRectangle();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
    }
}
/*
In the realWorld
For Example : you don't see all the inner workings of your computer, but the OS provides
        a simplified interface to use the machine. Buildings also have a facade - the exterior of the building. */
/*
Like the Adapter pattern, Facade is known as a structural pattern,as it's used to identifying a simple way to realize
        relationships between entities.*/
/*bangla vasai jeta buji sob class ar method gula user frinldy korar jonno akta protinidhi class create kora
hoase jate kore amra sudhu matro oi class ar object create korle onno sob class ar medhod attribute gula pai*/
