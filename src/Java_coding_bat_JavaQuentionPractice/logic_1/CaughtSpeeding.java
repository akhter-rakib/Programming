package Java_coding_bat_JavaQuentionPractice.logic_1;
/*You are driving a little too fast,and a police officer stops you.
        Write code to compute the result,encoded as an int value:0=no ticket,1=small ticket,
        2=big ticket.If speed is 60or less,the result is 0.If speed is between 61and 80
        inclusive,the result is 1.If speed is 81or more,the result is 2.Unless it is your
        birthday--on that day,your speed can be 5higher in all cases.
        caughtSpeeding(60,false) → 0
        caughtSpeeding(65,false) → 1
        caughtSpeeding(65,true) → 0*/

import java.util.Scanner;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int status = 0;
        if (isBirthday) {
            if (speed <= 65) {
                status = 0;
            } else if (speed >= 66 && speed <= 85) {
                status = 1;
            } else if (speed <= 86) {
                status = 2;
            }
        } else {
            if (speed <= 60) {
                status = 0;
            } else if (speed >= 61 && speed <= 80) {
                status = 1;
            } else if (speed >= 81) {
                status = 2;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give speed");
        int speed = scanner.nextInt();
        System.out.println("marks it is weekened or nor");
        boolean isBirthday = scanner.nextBoolean();
        int status = caughtSpeeding.caughtSpeeding(speed, isBirthday);

    }
}
