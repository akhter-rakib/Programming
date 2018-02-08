package basic.Interface;

public interface Draw {
    public void dosomething();

    default void hello() {
        System.out.println("this is a default method Where we can say something ");
    }
}
