package leetcode.problem_3;

public class CountAndSayPro {

    public String coundAndSay(int n) {
        if (n <= 0) {
            return "Give a valid No";
        }
        String res = "1";
        while (n > 1) {
            StringBuilder cur = new StringBuilder();
            for (int i = 0; i < res.length(); i++) {
                int count = 1;
                while ((i + 1 < res.length()) && res.charAt(i) == res.charAt(i + 1)) {
                    count += 1;
                    i++;
                }
                cur.append(count).append(res.charAt(i));
            }
            res = cur.toString();
            n--;
        }
        return res;

    }

    public static void main(String[] args) {
        String res = new CountAndSayPro().coundAndSay(5);
        System.out.println(res);
    }
}
