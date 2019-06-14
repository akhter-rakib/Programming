package designPattern.Singleton;

public class SingletonClass {
    public static SingletonClass singleton = new SingletonClass();

    //this instance is create during the class load
    /*A private Constructor prevents any other
        class from instantiating*/
    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {
        return singleton;
    }

    public void donPlz() {
        System.out.println("How are you");
    }

    protected static void demoMethod() {
        System.out.println("Demo method of Singleton");
    }
}
