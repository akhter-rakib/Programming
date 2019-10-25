package OCA_Book_Question;

public class equalAndDoubleEqualCompare {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("ja").append("va");
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2));//true
        System.out.println(sb1.toString() == s1);//false
        System.out.println(sb1.toString().equals(s1));//true
    }
}
