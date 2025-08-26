import java.sql.*;

public class LabNineteen {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/moviedb";
    private static final String USER = "root";
    private static final String PASS = "password";
    
    public static void main(String[] args) {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Create scrollable ResultSet
            String sql = "SELECT * FROM MOVIE";
            Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );
            
            ResultSet rs = stmt.executeQuery(sql);
            
            // Navigate to last row
            if (rs.last()) {
                System.out.println("Last row:");
                System.out.println("ID: " + rs.getInt("id") + 
                                 ", Title: " + rs.getString("title") + 
                                 ", Genre: " + rs.getString("genre"));
            }
            
            // Navigate to first row
            if (rs.first()) {
                System.out.println("\nFirst row:");
                System.out.println("ID: " + rs.getInt("id") + 
                                 ", Title: " + rs.getString("title") + 
                                 ", Genre: " + rs.getString("genre"));
            }
            
            // Navigate to third row
            if (rs.absolute(3)) {
                System.out.println("\nThird row:");
                System.out.println("ID: " + rs.getInt("id") + 
                                 ", Title: " + rs.getString("title") + 
                                 ", Genre: " + rs.getString("genre"));
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        }
        
        // Print lab info
        System.out.println("\nLab No.: 19");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
