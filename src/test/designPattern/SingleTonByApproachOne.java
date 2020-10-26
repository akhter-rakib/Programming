package test.designPattern;

public class SingleTonByApproachOne {

    private static SingleTonByApproachOne singleTonByApproachOne = new SingleTonByApproachOne();

    private SingleTonByApproachOne() {
    }

    public static SingleTonByApproachOne factoryMethod() {
        return singleTonByApproachOne;
    }

    public String demoMethod() {
        return "This is Demo Method";
    }
}
