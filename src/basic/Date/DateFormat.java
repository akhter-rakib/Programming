package basic.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println(myDateFormat.format(new Date()));

        String date = "1-Jan-2020";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        try {

            System.out.println(sdf.parse(date));
            Date d = sdf.parse(date);
            System.out.println(sdf.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
