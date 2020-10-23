package InterviewQuestion.Q1.pro;

public class RecursiveDemo {

    public int totalCounting(int p) {

        if (p > 0) {
            return p + totalCounting(p - 1);
        } else {
            return p;
        }
    }

    public static void main(String[] args) {
        RecursiveDemo recursiveDemo = new RecursiveDemo();
        int result = recursiveDemo.totalCounting(3);
        System.out.println(result);
    }
}
