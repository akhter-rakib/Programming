package designPattern.creationalDesignPattern.Singleton;

public class EarrlyInstantiateDemo {

    public static void main(String[] args) {

        //These two objects are using the same created object which is created during the class load ...
        EarlyInstantiationSingleton obj = EarlyInstantiationSingleton.getInstantiate();
        obj.addMethod();
        EarlyInstantiationSingleton obj2 = EarlyInstantiationSingleton.getInstantiate();
        obj2.addMethod();
    }
}
