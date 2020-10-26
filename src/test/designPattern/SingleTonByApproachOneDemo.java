package test.designPattern;

public class SingleTonByApproachOneDemo {

    public static void main(String[] args) {
        SingleTonByApproachOne singleTonByApproachOne = SingleTonByApproachOne.factoryMethod();
        System.out.println(singleTonByApproachOne.demoMethod());
    }
}
