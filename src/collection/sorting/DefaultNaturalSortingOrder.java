package collection.sorting;
//if we are depending on default natural sorting order then objects should be homogenious
//and compareable . default natural sorting order implements korte hole amader k must
//compareable interface class k inheritance korte hobe ..default vabe class ae interfce k inheritance kore
//only StringBuffer sara

import java.util.TreeSet;

public class DefaultNaturalSortingOrder {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("b");//b is root here
        treeSet.add("z");//z compareTo b
        treeSet.add("a");//a compareTo b
        System.out.println(treeSet);
        //default natural sorting order ar khetre jvm will call compareTo method tak-e call kore thake

    }

}
