package test;

import java.util.Scanner;

public class SumofdigitsfractionSerieswithplus {
    float sumofDigit(int value,int value2){
        float s=1,term=1;
        int n,x,i;
        n=value;
        x=value2;
        for(i=1;i<n;i++){

            term=term*x/(float)i;
            s=s+term;
        }
        return s;
    }
    public static void main(String[] args){
        float sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of terms:");
        Integer value = scanner.nextInt();
        System.out.println("Enter X Value:");
        Integer value2 = scanner.nextInt();
        sum=new SumofdigitsfractionSerieswithplus().sumofDigit(value,value2);
        System.out.println("Sum of Series: "+sum);
    }
}