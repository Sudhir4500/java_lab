import javax.swing.*;
import java.awt.event.*;

public class LabSixteen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Numeric Field");
        JTextField text = new JTextField(15);
        
        text.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if(!Character.isDigit(e.getKeyChar())) {
                    e.consume();
                }
            }
        });
        
        frame.add(text);
        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}