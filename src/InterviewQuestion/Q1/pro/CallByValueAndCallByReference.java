package InterviewQuestion.Q1.pro;

import designPattern.Facade.Rectangle;

public class CallByValueAndCallByReference {


    public static void modify(int x) {
        x = 40;
    }

    public static void modify(RectangleDemo rectangleDemo) {
        rectangleDemo.length = 40;
    }

    public static void main(String[] args) {
        /*Call By value */
        int x = 50;
        modify(x);
        System.out.println(x);
        /*Call by Reference */
        RectangleDemo demo = new RectangleDemo();
        demo.length = 49;
        modify(demo);
        System.out.println(demo.length);
    }
}

class RectangleDemo {
    float length;
    float breadth;
}
