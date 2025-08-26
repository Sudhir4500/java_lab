import java.sql.*;

public class LabTwenty {
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "root");
            
            // Create updatable ResultSet
            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = st.executeQuery(
                "SELECT * FROM students WHERE name = 'John'");
            
            if (rs.next()) {
                System.out.println("Found: " + rs.getString("name"));
                System.out.println("Old grade: " + rs.getString("grade"));
                
                // Update using ResultSet
                rs.updateString("grade", "A+");
                rs.updateRow();
                
                System.out.println("Grade updated to A+");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("\nLab No.: 20");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
