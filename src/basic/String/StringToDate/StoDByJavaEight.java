package basic.String.StringToDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*https://www.mkyong.com/java8/java-8-how-to-convert-string-to-localdate/*/
public class StoDByJavaEight {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = "16/08/2016";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

    }
}
