package javaEightFeatures.telusko;

public class DemoDeclareMethodInInterface extends C implements A, B {
    @Override
    public void add() {

    }

    /*
        @Override
        public void show() {

        }*/
//Here if we enable the show() method from B class then we have to Must @Override the show method because
// here can be ambiguous problem because same show method is also in A class.
    // To use default method name in interface we have to careful because same method can be in Object class too
    public static void main(String[] args) {
        DemoDeclareMethodInInterface demo = new DemoDeclareMethodInInterface();
        demo.show();// this show() is from C class because a Class method is powerful than interface default method
        StaticMethodinInterface.callMe();//Here the static method has been called
    }
}
