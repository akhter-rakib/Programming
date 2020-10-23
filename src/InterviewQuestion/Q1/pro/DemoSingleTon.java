package InterviewQuestion.Q1.pro;

public class DemoSingleTon {

    public static void main(String[] args) {
        DatabaseConnectionSingleTonOne databaseConnectionSingleTonOne = DatabaseConnectionSingleTonOne.getInstance();
        System.out.println(databaseConnectionSingleTonOne.hello());
        /*Demo Singleton by second approach*/
        DatabaseConnectionSingleTonTwo databaseConnectionSingleTonTwo = DatabaseConnectionSingleTonTwo.getInstance();
        System.out.println(databaseConnectionSingleTonTwo.hello());
    }
}
