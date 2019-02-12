package basic;

import java.util.ArrayList;
import java.util.List;

public class LastThreeDigit {
    public static void main(String[] args) {

        List<Integer> firsttThreeDigit = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            firsttThreeDigit.add(i);
            if (firsttThreeDigit.size() >= 3) {
                break;
            }
        }
        System.out.println(firsttThreeDigit);
    }
}
