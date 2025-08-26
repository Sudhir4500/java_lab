import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDPEchoClient {
    public static void main(String[] args) {
        try {
            // Create DatagramSocket
            DatagramSocket socket = new DatagramSocket();
            
            // Server details
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9090;
            
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                // Get message from user
                System.out.print("Enter message (type 'exit' to quit): ");
                String message = scanner.nextLine();
                
                // Send message to server
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(
                    sendData, sendData.length, serverAddress, serverPort
                );
                socket.send(sendPacket);
                
                // Receive echo from server
                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(
                    receiveBuffer, receiveBuffer.length
                );
                socket.receive(receivePacket);
                
                String echoMessage = new String(
                    receivePacket.getData(), 0, receivePacket.getLength()
                );
                System.out.println("Echo from server: " + echoMessage);
                
                // Exit if user typed "exit"
                if (message.toLowerCase().equals("exit")) {
                    break;
                }
            }
            
            scanner.close();
            socket.close();
            
        } catch (IOException e) {
            System.out.println("UDP Client error: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Print lab info
        System.out.println("\nLab No.: 22 (UDP Client)");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
