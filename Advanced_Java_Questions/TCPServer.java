import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("Server started on port 8080");
            
            Socket client = server.accept();
            System.out.println("Client connected");
            
            BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(
                client.getOutputStream(), true);
            
            String message = in.readLine();
            System.out.println("Received: " + message);
            
            out.println("Server received: " + message);
            
            client.close();
            server.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("\nLab No.: 21 (Server)");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
