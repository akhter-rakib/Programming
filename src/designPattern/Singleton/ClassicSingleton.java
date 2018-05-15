package designPattern.Singleton;

public class ClassicSingleton {
    private static ClassicSingleton instance;

    private ClassicSingleton() {
        //Exist only to defeat instantiation.
    }

    public static ClassicSingleton getInstance() {
        if (instance == null)
            instance = new ClassicSingleton();
        return instance;
    }

}
