package InterviewQuestion.Q1.orollo;

public class Looping {

    int s;

    int sum(int n) {

        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {

        int a = new Looping().sum(3);
        System.out.println(a);
    }
}
