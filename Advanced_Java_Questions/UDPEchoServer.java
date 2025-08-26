import java.io.*;
import java.net.*;

public class UDPEchoServer {
    public static void main(String[] args) {
        try {
            // Create DatagramSocket on port 9090
            DatagramSocket socket = new DatagramSocket(9090);
            System.out.println("UDP Echo Server listening on port 9090...");
            
            byte[] buffer = new byte[1024];
            
            while (true) {
                // Receive packet from client
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + message);
                
                // Get client address and port
                InetAddress clientAddress = packet.getAddress();
                int clientPort = packet.getPort();
                
                // Send the same data back to client (echo)
                byte[] responseData = message.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(
                    responseData, responseData.length, clientAddress, clientPort
                );
                
                socket.send(responsePacket);
                System.out.println("Echoed back to client: " + message);
                
                // Break if client sends "exit"
                if (message.toLowerCase().equals("exit")) {
                    break;
                }
            }
            
            socket.close();
            
        } catch (IOException e) {
            System.out.println("UDP Server error: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Print lab info
        System.out.println("\nLab No.: 22 (UDP Server)");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
