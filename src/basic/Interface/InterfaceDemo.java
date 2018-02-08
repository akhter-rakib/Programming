package basic.Interface;

public class InterfaceDemo implements Draw {
    @Override
    public void dosomething() {
        System.out.println("From Interface Class ");
    }

    public void doAnotherThing() {
        System.out.println("how are You ? ");
    }

    /*We can secure our method by interface please follow the bellow*/
    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo();//we can access both method
        interfaceDemo.doAnotherThing();
        interfaceDemo.dosomething();

        Draw draw = new InterfaceDemo();
        draw.dosomething();//We can access only interface class method by this we can secure our method


    }

}
