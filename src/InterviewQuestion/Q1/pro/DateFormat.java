package InterviewQuestion.Q1.pro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        String date = "1/Jan/2020";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        try {
            Date date1 = sdf.parse(date);
            String date2 = sdf.format(date1);
            System.out.println("Formatted Date is " + date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*   try {
            System.out.println(sdf.parse(date));
            Date d = sdf.parse(date);
            System.out.println(sdf.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        Date date1 = new Date();
        String str = sdf.format(date1);
        try {
            Date sdt = sdf.parse(str);

        } catch (ParseException e) {

        }
    }
}
