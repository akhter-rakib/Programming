package test;

public class DemoHead {
    public static void main(String[] args) {
        Head head = new HeadImp();
        head.doCommon();
        System.out.println(head.studentinfo()
        );
    }
}
