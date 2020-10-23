package InterviewQuestion.Q1.pro;

public class HoltingInRecursive {

    public int sumz(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public void valueShow(int n) {
        while (n > 0) {
            System.out.println("The value is " + n);
            n--;
        }
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        HoltingInRecursive holting = new HoltingInRecursive();
      /*  System.out.println(holting.sum(5, 6));
        System.out.println(holting.sumz(5, 6));*/
        holting.valueShow(3);
    }
}
