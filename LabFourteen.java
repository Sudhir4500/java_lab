import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class LabFourteen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Editor");
        JTextArea text = new JTextArea(10, 20);
        JButton read = new JButton("Read");
        JButton write = new JButton("Write");
        
        write.addActionListener(e -> {
            try(FileWriter fw = new FileWriter("userinput.txt")) {
                fw.write(text.getText());
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        });
        
        read.addActionListener(e -> {
            try(BufferedReader br = new BufferedReader(new FileReader("userinput.txt"))) {
                text.setText("");
                String line;
                while((line = br.readLine()) != null) {
                    text.append(line + "\n");
                }
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        });
        
        frame.add(new JScrollPane(text));
        frame.add(read);
        frame.add(write);
        
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}