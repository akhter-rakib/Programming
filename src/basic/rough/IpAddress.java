package basic.rough;

import java.net.Inet4Address;
import java.net.InetAddress;

/*1) Get the local host address by calling getLocalHost() method of InetAddress class.
        2) Get the IP address by calling getHostAddress() method.*/
public class IpAddress {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = Inet4Address.getLocalHost();
        System.out.println(localHost.getHostAddress());
    }
}
