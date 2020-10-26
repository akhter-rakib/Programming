package String;

public class ConcatMethod {
    public static void main(String[] args) {
        String country = "Bangladesh";
        country.concat("Is My Country");
        //The Bellow result will be only Bangladesh Because String is Immutable
        System.out.println(country);
        country = country.concat("Is Our Country");
        System.out.println(country);
    }
}
