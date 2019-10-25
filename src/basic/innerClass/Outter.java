package basic.innerClass;

public class Outter {
    class Inner {
        public void show() {
            System.out.println("Nested inner class method");
        }
    }

    class InnerTwo {
        public void show() {
            System.out.println("Nessted inner2 class method");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Outter.Inner in = new Outter().new Inner();
        in.show();
        Outter.InnerTwo s = new Outter().new InnerTwo();
        s.show();
    }
}
