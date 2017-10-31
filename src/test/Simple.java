package test;

import java.util.ArrayList;
import java.util.List;

class SimpleTrueAndFalseReturn {
    public List<List<Boolean>> trueFalse() {
        List list = new ArrayList();
        List<Boolean> tureValue = new ArrayList<>();
        List<Boolean> falseValue = new ArrayList<>();
        tureValue.add(true);
        falseValue.add(false);
        list.add(tureValue);
        list.add(falseValue);
        return list;
    }

    public static void main(String[] args) {
        List<List<Boolean>> ls = new SimpleTrueAndFalseReturn().trueFalse();
        List<Boolean> trueValue = ls.get(0);
        System.out.println(trueValue);
        List<Boolean> falseValue = ls.get(1);
        System.out.println(falseValue);
    }
}
