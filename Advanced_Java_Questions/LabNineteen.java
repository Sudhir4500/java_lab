import java.sql.*;

public class LabNineteen {
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "root");
            
            // Create scrollable ResultSet
            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            
            // Go to last row
            rs.last();
            System.out.println("Last row: " + rs.getString("name"));
            
            // Go to first row
            rs.first();
            System.out.println("First row: " + rs.getString("name"));
            
            // Go to 3rd row
            rs.absolute(3);
            System.out.println("Third row: " + rs.getString("name"));
            
            con.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("\nLab No.: 19");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
