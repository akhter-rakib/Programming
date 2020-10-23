package InterviewQuestion.Q1.pro;

public class DatabaseConnectionSingleTonTwo {
    private static DatabaseConnectionSingleTonTwo instance = null;

    private DatabaseConnectionSingleTonTwo() {
    }

    public static DatabaseConnectionSingleTonTwo getInstance() {
        if (instance == null)
            return new DatabaseConnectionSingleTonTwo();
        return instance;
    }

    public String hello() {
        return "rakib you are good man";
    }
}
