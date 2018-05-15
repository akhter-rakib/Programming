package test;

import java.util.ArrayList;
import java.util.List;

public class IqTest {
    private Integer num;
    List<Integer> val = new ArrayList();

    public List<Integer> doAdd() {
        for (int i = 1; i < 5; i++) {
            val.add(i);
        }
        return val;
    }

    public static void main(String[] args) {

        System.out.println(new IqTest().doAdd().add(5));

        System.out.println(new IqTest().doAdd());

    }
}
