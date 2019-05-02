package Java_coding_bat_JavaQuentionPractice.logic_1;
/*When squirrels get together for a party,they like to have cigars.
        A squirrel party is successful when the number of cigars is between 40and 60,
        inclusive.Unless it is the weekend,in which case there is no upper bound on the
        number of cigars.Return true if the party with the given values is successful,
        or false otherwise.
        cigarParty(30,false) → false
        cigarParty(50,false) → true
        cigarParty(70,true) → true*/

import java.util.Scanner;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40);
        } else {
            return (cigars >= 40 && cigars <= 60);
        }
    }

    public static void main(String[] args) {
        CigarParty cigarParty = new CigarParty();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz give quentity of cigars");
        int cigars = scanner.nextInt();
        System.out.println("marks it is weekened or nor");
        boolean isWeekened = scanner.nextBoolean();
        boolean status = cigarParty.cigarParty(cigars, isWeekened);
        System.out.println("The party is " + status);

    }
}
