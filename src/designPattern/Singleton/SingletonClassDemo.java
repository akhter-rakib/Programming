package designPattern.Singleton;

public class SingletonClassDemo {
    public static void main(String[] args) {
        SingletonClass tmp = SingletonClass.getSingletonClass();
        tmp.demoMethod();
        tmp.donPlz();
        // SingletonClass tmp = new SingletonClass()
    }
}
//need to read from here https://www.javaworld.com/article/2073352/core-java/simply-singleton.html
