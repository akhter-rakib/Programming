package basic.Date;

import java.util.Date;

public class ChangeDayOfDate {
public static Date getDateObj(){

    return new Date();
}
    public static void main(String[] args) {
        Date endDate = getDateObj();
        Date startDate = getDateObj();
        startDate.setDate(1);
        System.out.println("Strat Date " + startDate);
        System.out.println("End date " + endDate);
    }
}
