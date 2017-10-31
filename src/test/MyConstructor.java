package test;

public class MyConstructor {
    String x="f";
    String y="g";

    public MyConstructor(String x) {
        this("d","e");
     //   this.x=str;
        System.out.println(x);
    }

    public MyConstructor() {
        this("c");
        System.out.println("a");

    }

    public MyConstructor(String str, String str2) {
        this.y = str2;
        System.out.println(x+""+y);
    }

    public static void main(String[] args) {
        MyConstructor mc=new MyConstructor();
    }
}
