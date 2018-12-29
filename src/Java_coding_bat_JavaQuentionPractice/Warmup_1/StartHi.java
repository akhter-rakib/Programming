package Java_coding_bat_JavaQuentionPractice.Warmup_1;

public class StartHi {
    public boolean startHi(String str) {
        String firstTwoChar;
        firstTwoChar = str.substring(0, 2);
        System.out.println("First Two char is  " + firstTwoChar);
        /*if (firstTwoChar.equalsIgnoreCase("hi")) {
            System.out.println("True");
            return true;
        }*/
        return (firstTwoChar.equalsIgnoreCase("hi"));
    }

    public static void main(String[] args) {
        boolean startHI;
        StartHi startHi = new StartHi();
        startHI = startHi.startHi("hi there");
        System.out.println("Status Start with hi or not" + startHI);
    }
}
