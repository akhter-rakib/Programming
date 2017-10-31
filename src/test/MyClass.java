package test;

public class MyClass {
    int x = 7;

    public MyClass() {
        x++;//first a ae method call hobe and 7+1
        System.out.println("first" + x);
    }

    public MyClass(int i) {
        x += i;//akhen x agin 7 karon
        System.out.println("final" + x);
    }

    public int method(int i) {
        x += i;//8+3
        System.out.println("second" + x);
        return x;
    }

    public static void main(String[] args) {
        //new MyClass(new MyClass().method(3));
       new MyClass(new MyClass().method(3));
    }
}
