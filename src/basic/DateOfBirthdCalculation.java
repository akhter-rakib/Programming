package basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateOfBirthdCalculation {

    public static void main(String[] args) throws ParseException {
        String userDate;
        System.out.println("Give ur month date or Year  using like 1m,id,1y");
        Scanner scanner = new Scanner(System.in);
        userDate = scanner.nextLine();
        Character dmy = userDate.charAt(userDate.length() - 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dmyValue = userDate.replaceAll("\\D+", "");
        if (dmy.toString().equalsIgnoreCase("d") || dmy.toString().equalsIgnoreCase("y")
                || dmy.toString().equalsIgnoreCase("m")) {
            final Calendar cal = Calendar.getInstance();
            Date dob;
            if (dmy.toString().equalsIgnoreCase("d")) {
                cal.add(Calendar.DATE, -Integer.parseInt(dmyValue));
                dob = cal.getTime();
                String d = dateFormat.format(dob);
                System.out.println(d);
            } else if (dmy.toString().equalsIgnoreCase("y")) {
                cal.add(Calendar.YEAR, -Integer.parseInt(dmyValue));
                dob = cal.getTime();
                String d = dateFormat.format(dob);
                System.out.println(d);
            } else {
                cal.add(Calendar.MONTH, -Integer.parseInt(dmyValue));
                dob = cal.getTime();
                String d = dateFormat.format(dob);
                System.out.println(d);
            }
        } else {
            System.out.println("Plz Correct ur Date format  using like 1m,id,1y");
        }

    }
}
