package basic;

import java.util.Objects;

public class HahCode {

    public int hashCode(String login) {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(login);
        return hash;
    }

    public static void main(String[] args) {
        HahCode hahCode = new HahCode();
        //HahCode hah = new HahCode();
        int abs = hahCode.hashCode("rakibccj@gmail.com");
        int gmail = hahCode.hashCode("rakibccj@gmail");
        System.out.println(abs);
        System.out.println(gmail);
    }
}
