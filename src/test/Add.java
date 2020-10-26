package test;

public class Add {

    public static void main(String[] args) {
        int result = DemoStatic.add(2, 4);
        System.out.println(result);
    }
}
 class DemoStatics {
    public static int add(int a, int b) {
        return a + b;
    }
}
