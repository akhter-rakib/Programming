package basic.String;

/*A part of string is called substring. In other words, substring is a subset of another string.
        In case of substring startIndex is inclusive and endIndex is exclusive.*/

public class SubStringDemo {
    static String playerName = "MohammadAshraful";

    public static void main(String[] args) {
        String firstPart, secondPart;
        System.out.println("" + playerName);
        secondPart = playerName.substring(8);
        firstPart = playerName.substring(0, 8);
        System.out.println("First Part Of the Name " + firstPart);
        System.out.println("Second Part Of the Name " + secondPart);
        System.out.println("To make concat " + firstPart.concat(secondPart));
    }
}
