package designPattern.Singleton;

public class SingletonClassByApproachTwoDemo {

    public static void main(String[] args) {
        SingletonClassByApproachTwo singletonClassByApproachTwo = SingletonClassByApproachTwo.getInstance();
        System.out.println(singletonClassByApproachTwo.demoMethod());
    }
}
