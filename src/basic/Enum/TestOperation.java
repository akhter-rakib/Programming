package basic.Enum;

public class TestOperation {

    public static void main(String[] args) {
        double plusValue = Operation.PLUS.calculation(1, 3);
        double multipleValue = Operation.MULTIPLE.calculation(4, 7);
        boolean userStatusCheck=Operation.ADMIN.isAdmin("ADMIN");
        System.out.println("This is Admin " +userStatusCheck);
        System.out.println(plusValue);
        System.out.println(multipleValue);
    }
}
