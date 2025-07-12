import java.io.RandomAccessFile;

public class LabElevenA {
    public static void main(String[] args) throws Exception {
        // Create file with some data
        RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
        file.writeBytes("HelloWorld");
        
        // Move to position 5 and read
        file.seek(5);
        System.out.println("Char at pos 5: " + (char)file.read());
        
        // Write at position 5
        file.seek(5);
        file.writeBytes("Java");
        
        // Read modified content
        file.seek(0);
        System.out.println("Modified content: " + file.readLine());
        
        file.close();
        
        System.out.println("\nLab No.: 11a");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}