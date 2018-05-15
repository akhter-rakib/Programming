package designPattern.creationalDesignPattern.Singleton;

public class LazyInstantiate {

    public static void main(String[] args) {
        LazyInstantiateSingleton obj = LazyInstantiateSingleton.getIntantiate();
        obj.searchingPatient("Rakib");
        LazyInstantiateSingleton obj2 = LazyInstantiateSingleton.getIntantiate();
        obj2.searchingPatient("Hasan");
    }
}
