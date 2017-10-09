package basic;

/**
 * Created by Atuar on 10/8/2017.
 */
public class Gcd {
    public static void main(String[] args) {
        int m,n,r;
        m = 81; n = 153;

        r = m%n;
        while(r != 0){
            m=n;
            n=r;
            r = m%n;
        }
        System.out.println("GCD = "+n);
    }
}
