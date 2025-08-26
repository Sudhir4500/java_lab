import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Connected to server!");
            
            // Create input and output streams
            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true
            );
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            
            // Read input from user console
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter message to send to server: ");
            String message = scanner.nextLine();
            
            // Send message to server
            out.println(message);
            
            // Read response from server
            String response = in.readLine();
            System.out.println("Server response: " + response);
            
            // Close connections
            scanner.close();
            in.close();
            out.close();
            socket.close();
            
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Print lab info
        System.out.println("\nLab No.: 21 (Client)");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
