package collection.sorting;

/**
 * Created by Rakib on 8/1/2017.
 */
//If we depend on default natural sorting order then JVM will call compareTo()
public class CompareAbleClass {

    public static void main(String[] args) {
        System.out.println("A".compareTo("Z"));
        System.out.println("z".compareTo("a"));
        System.out.println("A".compareTo("A"));
    }
}
