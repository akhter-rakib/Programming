package basic.rough;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculation {
    public static void main(String[] args) throws ParseException {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(input);
         Date date=new Date();
        date.compareTo(date1);
        System.out.println(date.compareTo(date1));
    }
}
