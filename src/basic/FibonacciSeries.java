package basic;

import java.util.Scanner;
//0 1 1 2 akhen first 2ta add kore next a akta value pai then second value and next value add
//korle abar porer next ta pai
//example ... next = first+second; second+next()=next
public class FibonacciSeries {

    public static void main(String[] args) {

        Integer firsNumber;
        Integer secondNumber;
        Integer nextNumber;
        Integer totalNumber;
        System.out.println("Give the first element of series");
        Scanner firScanner = new Scanner(System.in);
        firsNumber = firScanner.nextInt();
        System.out.println("Give the second element of series");
        Scanner secondScanner = new Scanner(System.in);
        secondNumber = secondScanner.nextInt();
        System.out.println("please enter totalNumber of Print");
        Scanner totalScanner = new Scanner(System.in);
        totalNumber = totalScanner.nextInt();
        System.out.print(firsNumber + " " + secondNumber + " ");

        for (int i = 0; i < totalNumber; i++) {
            nextNumber = firsNumber + secondNumber;
            firsNumber = secondNumber;
            secondNumber = nextNumber;
            System.out.println(nextNumber + "");
        }
    }
}
