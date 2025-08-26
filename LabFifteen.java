import javax.swing.*;
import java.awt.event.*;

public class LabFifteen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Demo");
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        String[] items = {"New", "Save", "Exit"};
        for(String item : items) {
            JMenuItem menuItem = new JMenuItem(item);
            if(item.equals("Exit")) {
                menuItem.addActionListener(e -> System.exit(0));
            }
            fileMenu.add(menuItem);
        }
        
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}