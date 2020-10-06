import java.net.*;
import java.util.*;
public class FindIPAddress {

    public static void main(String args[]) {
        String host;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan ip address: ");
        host = input.next();
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println(
                    "Nama Host : " + address.getHostName());
        } catch (UnknownHostException uhEx) {
            System.out.println(
                    "Host not found:" + host);
        }
    }
}
