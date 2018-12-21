package basic.String.StringToDate;
/*https://beginnersbook.com/2013/04/java-string-to-date-conversion/*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class VariousDateFormat {
    public static void main(String[] args) {
        String testDateString = "02/04/2014";
        String testDateString2 = "02-04-2014 23:37:50";
        String testDateString3 = "02-Apr-2014";
        String testDateString4 = "04 02, 2014";
        String testDateString5 = "Thu, Apr 02 2014";
        String testDateString6 = "Fri, Apr 02 2014 23:37:50";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        DateFormat df3 = new SimpleDateFormat("dd-MMM-yyyy");
        DateFormat df4 = new SimpleDateFormat("MM dd, yyyy");
        DateFormat df5 = new SimpleDateFormat("E, MMM dd yyyy");
        DateFormat df6 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
        try {
            Date date6 = df6.parse(testDateString6);
            System.out.println(df6.format(date6));
            Date d5 = df5.parse(testDateString5);
            System.out.println("Date: " + d5);
            System.out.println("Date in E, MMM dd yyyy format is: " + df5.format(d5));
        } catch (ParseException p) {
            System.out.println(p);
        }
    }
}
