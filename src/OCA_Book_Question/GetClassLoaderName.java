package OCA_Book_Question;

public class GetClassLoaderName {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("OCA_Book_Question.GetClassLoaderName");
        System.out.println(c.getClassLoader());
    }
}
