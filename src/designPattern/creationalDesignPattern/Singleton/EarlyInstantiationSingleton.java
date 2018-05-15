package designPattern.creationalDesignPattern.Singleton;

public class EarlyInstantiationSingleton {

    private static EarlyInstantiationSingleton instantiate = new EarlyInstantiationSingleton();

    private EarlyInstantiationSingleton() {
        /*A private Constructor prevents any other
                                  class from instantiating*/
    }

    public static EarlyInstantiationSingleton getInstantiate() {
        return instantiate;
    }

    public void addMethod() {
        System.out.println("This is a add method ");
    }

}
