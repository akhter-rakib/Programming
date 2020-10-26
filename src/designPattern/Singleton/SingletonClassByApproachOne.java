package designPattern.Singleton;

public class SingletonClassByApproachOne {
    public static SingletonClassByApproachOne singleton = new SingletonClassByApproachOne();

    //this instance is create during the class load
    /*A private Constructor prevents any other
        class from instantiating*/
    private SingletonClassByApproachOne() {

    }

    public static SingletonClassByApproachOne getSingletonClassByApproachOne() {
        return singleton;
    }

    public void donPlz() {
        System.out.println("How are you");
    }

    protected static void demoMethod() {
        System.out.println("Demo method of Singleton");
    }
}
