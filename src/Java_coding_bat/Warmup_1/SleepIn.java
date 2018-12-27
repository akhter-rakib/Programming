package Java_coding_bat.Warmup_1;

import java.util.Scanner;

/*The parameter weekday is true if it is a weekday, and the parameter
        vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/
public class SleepIn {
    public boolean sleepin(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean weekly, vacation;
        Scanner scanner = new Scanner(System.in);
        weekly = scanner.nextBoolean();
        vacation = scanner.nextBoolean();
        SleepIn sleep = new SleepIn();
        boolean isSleep = sleep.sleepin(weekly, vacation);
        if (isSleep) {
            System.out.println("Nak Deke ghum hobe dada");
        } else {
            System.out.println("Az ghum hobe na dada");
        }
        // Solution notes: better to write "vacation" than "vacation == true"
        // though they mean exactly the same thing.
        // Likewise "!weekday" is better than "weekday == false".
        // This all can be shortened to: return (!weekday || vacation);
        // Here we just put the return-false last, or could use an if/else.
    }
}
