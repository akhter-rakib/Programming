package basic.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println(myDateFormat.format(new Date()));

    }
}
