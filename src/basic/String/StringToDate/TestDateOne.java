package basic.String.StringToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateOne {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String date = "7-Jun-2013";
        try {
            Date date1 = simpleDateFormat.parse(date);
            System.out.println(date1);
            System.out.println(simpleDateFormat.format(date1));
        } catch (ParseException p) {
            p.printStackTrace();
        }
    }
}
