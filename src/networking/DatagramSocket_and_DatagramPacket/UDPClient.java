package networking.DatagramSocket_and_DatagramPacket;

import javax.security.auth.login.AccountLockedException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {

        try{
            // Create a DatagramSocket to send and receive packets
            DatagramSocket socket=new DatagramSocket();
            InetAddress serverAddress=InetAddress.getByName("localhost");

            // Prepare data to send to the server

            String message="hello from client side....";
            byte[] sendBuffer=message.getBytes();

            // Create a DatagramPacket to send data to the server on port 5000

            //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            DatagramPacket sendPacket=new DatagramPacket(sendBuffer,sendBuffer.length,serverAddress,5000);//Constructs a datagram packet for sending packets of length length to the specified port number on the specified host.

            // Send the packet to the server
            socket.send(sendPacket);
            System.out.println("Message sent to the server");

            // Prepare a buffer to receive the server's response
            byte[] receiveBuffer=new byte[1024];
            DatagramPacket receivePacket=new DatagramPacket(receiveBuffer,receiveBuffer.length);

            // Receive the server's response

            socket.receive(receivePacket);
            String response=new String(receivePacket.getData(),0,receivePacket.getLength());
            System.out.println("recieved from server:"+response);

            // Close the socket after communication

            socket.close();





        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
