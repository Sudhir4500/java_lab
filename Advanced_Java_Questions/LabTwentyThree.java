import java.net.*;
import java.net.URI;

public class LabTwentyThree {
    public static void main(String[] args) {
        try {
            // Create URL object
            URI uri = URI.create("https://www.example.com/index.html?user=test");
            URL url = uri.toURL();
            
            // Print URL components
            System.out.println("Complete URL: " + url.toString());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File Path: " + url.getFile());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Path: " + url.getPath());
            System.out.println("Authority: " + url.getAuthority());
            
            // Additional URL examples
            System.out.println("\n--- Additional URL Examples ---");
            
            URL url2 = URI.create("http://localhost:8080/webapp/login.jsp").toURL();
            System.out.println("URL 2: " + url2);
            System.out.println("Protocol: " + url2.getProtocol());
            System.out.println("Host: " + url2.getHost());
            System.out.println("Port: " + url2.getPort());
            System.out.println("Path: " + url2.getPath());
            
            URL url3 = URI.create("ftp://ftp.example.com/files/document.pdf").toURL();
            System.out.println("\nURL 3: " + url3);
            System.out.println("Protocol: " + url3.getProtocol());
            System.out.println("Host: " + url3.getHost());
            System.out.println("File: " + url3.getFile());
            
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Print lab info
        System.out.println("\nLab No.: 23");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
