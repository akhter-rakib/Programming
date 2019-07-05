package javaEightFeatures.DurgaSoft;

@FunctionalInterface//it is optional to check it is Fi(functional interface) or not.FI
//FI means the function having only one abstruct method

public interface FunctionInterface {
    public void m1();//abstruct method

    default void m2() {

    }

    public static void m3() {

    }


}
