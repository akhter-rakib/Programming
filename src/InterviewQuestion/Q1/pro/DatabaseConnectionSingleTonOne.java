package InterviewQuestion.Q1.pro;

public class DatabaseConnectionSingleTonOne {
    //this instance is create during the class load
    /*A private Constructor prevents any other
        class from instantiating*/
    private static DatabaseConnectionSingleTonOne databaseConnectionSingleTonOne = new DatabaseConnectionSingleTonOne();

    private DatabaseConnectionSingleTonOne() {
    }

    public static DatabaseConnectionSingleTonOne getInstance() {
        return databaseConnectionSingleTonOne;
    }

    public String hello() {
        return "Hello Mr. Rakib";
    }
}
