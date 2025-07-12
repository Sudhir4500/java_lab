import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabTwelve {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Buttons");
        frame.setLayout(new FlowLayout());
        
        String[] colors = {"RED", "BLUE", "GREEN"};
        for(String color : colors) {
            JButton btn = new JButton(color);
            btn.addActionListener(e -> {
                switch(color) {
                    case "RED": btn.setBackground(Color.RED); break;
                    case "BLUE": btn.setBackground(Color.BLUE); break;
                    case "GREEN": btn.setBackground(Color.GREEN); break;
                }
            });
            frame.add(btn);
        }
        
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}