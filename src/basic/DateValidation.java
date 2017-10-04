package basic;

import java.util.Scanner;

/*A year is a leap year when:
1.it is a multiple of 4
2.but not if it is also a multiple of 100
3.unless it is also a multiple of 400.*/
public class DateValidation {

    static boolean valid_date(int dd, int mm, int yy) {
        if (mm < 1 || mm > 12) {
            return false;
        }
        if (dd < 1) {
            return false;
        }
        int days = 31;
        if (mm == 2) {
            //user given date months jodi feb tahole ata leap year check kore dekhte hobe
            //leap Year hole 29 ar na hole 28 hobe
            days = 28;
            if (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) {
                days = 29;
            }
        } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
            //4,6,9,11 all time 30 days  april,june,september,november
            days = 30;
        }

        if (dd > days) {
            //user given day must have to bellow than months days
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int dd, mm, yy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a date(day/month/year):");
        dd = scanner.nextInt();
        mm = scanner.nextInt();
        yy = scanner.nextInt();
        System.out.println(valid_date(dd, mm, yy) ? "valid" : "Is_not_valid");

    }
}

