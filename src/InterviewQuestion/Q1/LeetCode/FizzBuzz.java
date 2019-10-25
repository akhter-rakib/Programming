package InterviewQuestion.Q1.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*Write a program that outputs the string representation of numbers from 1 to n.
        But for multiples of three it should output “Fizz” instead of the number and for
        the multiples of five output “Buzz”. For numbers which are multiples of both three
        and five output “FizzBuzz”.*/
public class FizzBuzz {

    static List<String> fizzBuzz(int n) {
        List<String> values = new ArrayList<>();
        Integer integer;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                values.add("FizzBuzz");
            } else if (i % 3 == 0) {
                values.add("Fizz");
            } else if (i % 5 == 0) {
                values.add("Buzz");
            } else {
                integer = new Integer(i);
                values.add(integer.toString());
            }
        }
        return values;
    }

    public static void main(String[] args) {
        List<String> values = fizzBuzz(15);
        values.forEach(val -> System.out.println(val));
    }
}