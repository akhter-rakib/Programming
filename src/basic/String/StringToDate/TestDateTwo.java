package basic.String.StringToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateTwo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = "07/06/2013";
        try {
            Date date1 = sdf.parse(date);
            System.out.println(date1);
            System.out.println(sdf.format(date1));
        } catch (ParseException p) {

        }
    }
}
