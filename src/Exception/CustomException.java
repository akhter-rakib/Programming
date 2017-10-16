package Exception;

public class CustomException {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not Valid");
        else
            System.out.println("WelCome to vote ");
    }

    public static void main(String[] args) {
        try {
            validate(17);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
        System.out.println("Working next Code");
    }
}
