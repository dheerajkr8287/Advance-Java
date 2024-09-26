package networking;

import java.net.InetAddress;
import java.util.Arrays;

/*
InetAddress encapsulates both the hostname and IP address. It can be used to resolve hostnames to IP addresses or to obtain the local IP address.

Key Methods:
getByName(String host): Returns an InetAddress object for the specified hostname.
getHostAddress(): Returns the IP address as a string.
getLocalHost(): Returns the IP address of the local host.
 */
public class inetAddressclass {
    public static void main(String[] args) {
     try{
         InetAddress address=InetAddress.getByName("github.com");
         System.out.println("Hostname:"+address.getHostName());
         System.out.println("IP address:"+address.getHostAddress());
         System.out.println("address:"+ Arrays.toString(address.getAddress()));
         System.out.println("local address:"+address.isAnyLocalAddress());

         boolean reachable=address.isReachable(5000);
         System.out.println("is reachable:"+reachable);
     }
     catch (Exception e){
         System.out.println(e.getMessage());
     }
    }
}


/*
Important Notes
InetAddress is not thread-safe, so be cautious when using it in multi-threaded applications.
isReachable() may require elevated privileges or special network configurations to work correctly, especially in restricted network environments.
In some cases, DNS resolution might return multiple IP addresses for a single hostname, especially in the case of load balancing or failover configurations.


Subclasses
InetAddress has two important subclasses:

Inet4Address: This class handles IPv4 addresses.
Inet6Address: This class deals with IPv6 addresses.




 */