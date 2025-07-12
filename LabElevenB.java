import java.io.*;
import java.util.Scanner;

public class LabElevenB {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter("userinput.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        
        System.out.println("Enter text (type 'exit' to stop):");
        String line;
        while(!(line = sc.nextLine()).equalsIgnoreCase("exit")) {
            bw.write(line);
            bw.newLine();
        }
        
        bw.close();
        System.out.println("Data written to file");
        
        System.out.println("\nLab No.: 11b");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}