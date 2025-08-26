import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Connected to server");
            
            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            
            out.println("Hello from client");
            
            String response = in.readLine();
            System.out.println("Server says: " + response);
            
            socket.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("\nLab No.: 21 (Client)");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
