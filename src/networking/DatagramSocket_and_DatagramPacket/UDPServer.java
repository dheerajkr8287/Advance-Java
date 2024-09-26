package networking.DatagramSocket_and_DatagramPacket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket(5000);
            byte[] receiveBuffer=new byte[1024];

            // Create a DatagramPacket to receive data
            DatagramPacket receivePacket=new DatagramPacket(receiveBuffer,receiveBuffer.length);
            System.out.println("server is listening on port 5000....");

            // Receive a packet (blocking call)
            socket.receive(receivePacket);
            String receivedData =new String(receivePacket.getData(),0,receivePacket.getLength());
            System.out.println("recived from client:"+receivedData);

            // Prepare a response to send back to the client

            String response="hello from server ..";
            byte[] sendBuffer=response.getBytes();

            // Create a packet to send the response to the client's address and port

            DatagramPacket sendPacket=new DatagramPacket(sendBuffer,sendBuffer.length,receivePacket.getAddress(),receivePacket.getPort());

            // Send the response packet
            socket.send(sendPacket);

            // Close the socket after communication
            socket.close();
            System.out.println("Server closed.");



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
