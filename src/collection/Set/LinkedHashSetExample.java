package collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String args[]) {
        // LinkedHashSet of String Type
       /* Since Set interface or HashSet class doesn't provide a get() method to retrieve elements,
        the only way to take out elements from a Set is to iterate over it by using Iterator, or loop
        over Set using advanced for loop of Java 5. You can get the iterator by calling the iterator()
        method of Set interface.*/
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();
        lhset.add("Z");
        lhset.add("PQ");
        lhset.add("N");
        lhset.add("O");
        lhset.add("KK");
        lhset.add("FGH");
        System.out.println(lhset);

        Iterator<String> values = lhset.iterator();

        while (values.hasNext()) {
            System.out.println("Value traverse by  while loop : " + values.next());
        }

        for (String value : lhset) {
            System.out.println("Value traverse by for loop : " + value);
        }

        //Useing java 8 forech Loop
        lhset.forEach(System.out::println);
    }
}