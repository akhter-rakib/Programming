package javaEightFeatures.telusko;

interface AI {
    //void show();

    void show2(int i);
/*
    void sum();*/
}

/*
class Xyz implements AI {

    @Override
    public void show() {
        System.out.println("TO SHOW FROM Implemented Class");
    }
}
*/

public class LambdaExpressionDemo {


    public static void main(String[] args) {
        AI ai;
        /*  ai = new Xyz();*/ //here to implement only one method we have to create another class
        /*ai = new AI() { we also can handle it by introducing by anonymous inner class . It will create a anonymous class file
            @Override
            public void show() {
                System.out.println("");
            }
        };*/
        /*Now in the bellow lambda Expression we can easily handle it and it also will not create any class to do this*/

        ai = (int i) -> System.out.println("Here is value " + i);
        /* lambda expressions are a way to implement interfaces without making a new class*/
        /* lambda expressions only work with interface implementing only 1 method which is called a functional interface.*/
        ai.show2(10);
    }
}
