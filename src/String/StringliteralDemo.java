package String;

public class StringliteralDemo {
    public static void main(String[] args) {
        String s = "Schin";
        String p = "Schin";//It will not create a new String .First jvm check the String Constant pool if the
        //String is available there then that String will referece to p .That means already created Schin will
        //refer to p too :)
        System.out.println(s);
        System.out.println(p);
    }
}
