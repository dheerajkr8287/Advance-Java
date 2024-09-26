package networking.SocketandServerSocket;


import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try{
            // Create a server socket listening on port 1234
            ServerSocket serverSocket=new ServerSocket(1234);
            System.out.println("server is start listening on port 1234....");
            //accepting an incoming client connextion
            Socket socket=serverSocket.accept();
            System.out.println("Client is connected ");
            //get input and output streams from the socket
          // Receiving Data from the Client:
            InputStream input=socket.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(input));
            //Sending Data to the Client:
            OutputStream output=socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Read client message
            String clientMessage=reader.readLine();
            System.out.println("Received from  client:"+clientMessage);

            //send response to client
            writer.println("Hello client ,your message was received");


            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}