package designPattern.creationalDesignPattern.Singleton;

public class LazyInstantiateSingleton {

    private static LazyInstantiateSingleton singleton;

    private LazyInstantiateSingleton() {

    }

    public static LazyInstantiateSingleton getIntantiate() {
        if (singleton == null) {
            return new LazyInstantiateSingleton();
        }
        return singleton;
    }

    public void searchingPatient(String name) {
        System.out.println(" Where are you ? " + name);
    }

}
