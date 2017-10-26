package designPattern.Singleton;

public class SingletonClass {
    private static SingletonClass singleton = new SingletonClass();

    //this instance is create during the class load
    /*A private Constructor prevents any other
        clas from instantiating*/
    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {
        return singleton;
    }

    protected static void demoMethod() {
        System.out.println("Demo method of Singleton");
    }
}
