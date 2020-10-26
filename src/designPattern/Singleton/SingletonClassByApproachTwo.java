package designPattern.Singleton;

public class SingletonClassByApproachTwo {
    private static SingletonClassByApproachTwo instance = null;

    private SingletonClassByApproachTwo() {
        //Exist only to defeat instantiation.
    }

    public static SingletonClassByApproachTwo getInstance() {
        //this instance created after first call this method
        if (instance == null)
            instance = new SingletonClassByApproachTwo();
        return instance;
    }

    public String demoMethod() {
        return "Hello Sir This is Demo Method";
    }

}
