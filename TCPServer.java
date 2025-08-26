import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            // Create server socket on port 8080
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server listening on port 8080...");
            
            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");
            
            // Create input and output streams
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
            );
            PrintWriter out = new PrintWriter(
                clientSocket.getOutputStream(), true
            );
            
            // Read message from client
            String message = in.readLine();
            System.out.println("Received from client: " + message);
            
            // Send response to client
            out.println("Server received: " + message);
            
            // Close connections
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
            
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Print lab info
        System.out.println("\nLab No.: 21 (Server)");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
