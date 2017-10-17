package basic.Exception;

public class ExceptionHandle {

    public static void main(String[] args) {
        int num = 0;

        try {
            int numb2 = 0;
            numb2 = 12 / num;
        } catch (ArithmeticException e) {

        } catch (Exception e) {
            System.out.println("exception occure  :" + e);
        }
        System.out.println("Last poit of this program");
    }
}
