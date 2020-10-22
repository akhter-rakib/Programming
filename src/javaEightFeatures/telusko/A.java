package javaEightFeatures.telusko;

public interface A {
    public abstract void add();

    default void show() {
        System.out.println("this is a default method");
    }

    /*default boolean equals(Object object) {
        return true;
    }*/
}
