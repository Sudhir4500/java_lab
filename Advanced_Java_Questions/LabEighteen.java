import java.sql.*;

public class LabEighteen {
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "root");
            
            System.out.println("Connected to database!");
            
            // Insert data
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)");
            ps.setString(1, "John");
            ps.setInt(2, 20);
            ps.setString(3, "A");
            ps.executeUpdate();
            System.out.println("Data inserted!");
            
            // Update data
            PreparedStatement ps2 = con.prepareStatement(
                "UPDATE students SET grade = ? WHERE name = ?");
            ps2.setString(1, "A+");
            ps2.setString(2, "John");
            ps2.executeUpdate();
            System.out.println("Data updated!");
            
            con.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("\nLab No.: 18");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
