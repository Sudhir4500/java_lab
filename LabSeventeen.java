import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class LabSeventeen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Options Demo");
        
        JCheckBox check = new JCheckBox("Enable Extra Options");
        JRadioButton[] radios = {
            new JRadioButton("Option A"),
            new JRadioButton("Option B"), 
            new JRadioButton("Option C")
        };
        
        ButtonGroup group = new ButtonGroup();
        for(JRadioButton radio : radios) {
            group.add(radio);
            radio.setEnabled(false);
            radio.addItemListener(e -> {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println(radio.getText() + " selected");
                }
            });
        }
        
        check.addItemListener(e -> {
            boolean enabled = e.getStateChange() == ItemEvent.SELECTED;
            for(JRadioButton radio : radios) {
                radio.setEnabled(enabled);
            }
        });
        
        frame.add(check);
        for(JRadioButton radio : radios) {
            frame.add(radio);
        }
        
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}