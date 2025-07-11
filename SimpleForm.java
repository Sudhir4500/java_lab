import javax.swing.*;
import java.awt.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Name
        frame.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(15);
        frame.add(nameField);

        // Password
        frame.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField(15);
        frame.add(passwordField);

        // Hobbies
        frame.add(new JLabel("Hobbies:"));
        JPanel hobbiesPanel = new JPanel(new FlowLayout());
        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox gaming = new JCheckBox("Gaming");
        hobbiesPanel.add(reading);
        hobbiesPanel.add(gaming);
        frame.add(hobbiesPanel);

        // Gender
        frame.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout());
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);

        frame.setVisible(true);
    }
}