package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

    public static String findDay(int day, int month, int year) {
        Date date = null;
        String dateString = day + "-" + month + "-" + year;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String[] days = new String[]{"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("TEST" + cal.get(Calendar.DAY_OF_WEEK));
        String dayName = days[cal.get(Calendar.DAY_OF_WEEK) - 1];
        return dayName.toUpperCase();
    }

    public static void main(String[] args) {
        String day = findDay(8, 05, 2015);
        System.out.println(day);

    }
}
