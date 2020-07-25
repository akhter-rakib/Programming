package hackerrank;

import java.util.Scanner;

public class SubStringApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int firstInd, secInd;
        System.out.println("Please a Give a Value");
        name = scanner.next();
        System.out.println("Please Give the firstIndex");
        firstInd = scanner.nextInt();
        
        while (name.length() < firstInd) {
            System.out.println("Please give the index between 0 to " + name.length());
            firstInd = scanner.nextInt();
        }
        System.out.println("please give the secondIndex");
        secInd = scanner.nextInt();
        while (firstInd >= secInd) {
            System.out.println("Please give getter number than first Index");
            secInd = scanner.nextInt();
        }
        String sub_value = name.substring(firstInd, secInd);
        System.out.println("Sub Value is " + sub_value);

    }
}
