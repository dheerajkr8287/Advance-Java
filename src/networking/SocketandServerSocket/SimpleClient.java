package networking.SocketandServerSocket;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server at localhost on port 1234
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to the server");

            // Get input and output streams from the socket
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Send a message to the server
            writer.println("Hello Server!");

            // Read the server's response
            String serverMessage = reader.readLine();
            System.out.println("Received from server: " + serverMessage);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
