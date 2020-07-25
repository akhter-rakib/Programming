package leetcode.problem_3;

public class CountAndSay {

    public String countAndSay(int n) {
        if (n <= 0) {
            return "plz give a valid number to print";
        }
        String res = "1";
        while (n > 1) {
            StringBuilder cur = new StringBuilder();
            for (int i = 0; i < res.length(); ++i) {
                int count = 1;
                while (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
                    ++count;
                    ++i;
                }
                cur.append(count).append(res.charAt(i));
                System.out.println(cur);
            }
            res = cur.toString();
            --n;
        }
        return res;
    }

    public static void main(String[] args) {
        String st = new CountAndSay().countAndSay(5);
        System.out.println(st);
    }
}
