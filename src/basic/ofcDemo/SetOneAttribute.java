package basic.ofcDemo;

import java.util.ArrayList;
import java.util.List;

public class SetOneAttribute {
    public static void main(String[] args) {
        List<SetOneAttributeDemo> list = new ArrayList<>();
        SetOneAttributeDemo soa = new SetOneAttributeDemo();
        soa.setId(1);
        soa.setName("Hasan");
        SetOneAttributeDemo soa2 = new SetOneAttributeDemo();
        soa2.setId(2);
        soa2.setName("Khan");
        list.add(soa);
        list.add(soa2);

        int i = 0;
        for (SetOneAttributeDemo demo : list) {
            demo.setRollNo(i);
            i++;
        }
        for (SetOneAttributeDemo demo : list) {
            // System.out.println(demo.getName());
            System.out.println(demo.getName());
            System.out.println(demo.getRollNo());
        }

    }
}
