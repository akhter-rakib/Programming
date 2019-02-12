package basic;

import java.util.ArrayList;
import java.util.List;

public class AddAndAddAllMethod {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("8");
        a1.add("A");
        System.out.println(a1.size() + "  -  " + a1);
        List<List<String>> a2 = new ArrayList<>();
        a2.add(a1);


        System.out.println(a2.size() + " = " + a2);

    }
}
