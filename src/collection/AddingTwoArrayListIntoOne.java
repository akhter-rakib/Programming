package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rakib on 7/28/2017.
 */
public class AddingTwoArrayListIntoOne {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("rakib");
        name.add("Khan");
        name.add("Pagol");
        ArrayList<String> address = new ArrayList<String>();
        address.add("Jessore");
        address.add("RailRoad");
        address.add("kustiapara");
        address.addAll(name);
        Iterator itr = address.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("The retainAll() method is used to remove it's elements from a list that" +
                " are not contained in the specified collection.");
        // create an empty array list
        ArrayList<String> color_list = new ArrayList<String>();

        // use add() method to add values in the list
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");

        // create an empty array sample with an initial capacity
        ArrayList<String> sample = new ArrayList<String>();

        // use add() method to add values in the list
        sample.add("Green");
        sample.add("Red");
        sample.add("White");

        System.out.println("First List :" + color_list);
        System.out.println("Second List :" + sample);
        sample.retainAll(color_list);//Green will be deleted from this list
        System.out.println("After applying the method, First List :" + color_list);
        System.out.println("After applying the method, Second List :" + sample);


    }
}
