package test;

public class TestValueChecker {
    public static void main(String[] args) {
        TestValueCheckerImp checkerImp=new TestValueCheckerImp();
        checkerImp.checkValue("IPD");
        System.out.println(checkerImp.getMessag());
    }
}
