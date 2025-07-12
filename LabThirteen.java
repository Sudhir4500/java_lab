import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class LabThirteen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        JTextField text = new JTextField(15);
        JButton btn = new JButton("Click");
        
        btn.addActionListener(e -> 
            JOptionPane.showMessageDialog(frame, text.getText()));
        
        text.setText("Hello World");
        frame.add(text);
        frame.add(btn);
        
        frame.setLayout(new FlowLayout());
        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}