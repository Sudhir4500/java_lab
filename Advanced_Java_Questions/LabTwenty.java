import java.sql.*;

public class LabTwenty {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/moviedb";
    private static final String USER = "root";
    private static final String PASS = "password";
    
    public static void main(String[] args) {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Create updatable ResultSet
            String sql = "SELECT * FROM MOVIE WHERE title = 'Interstellar'";
            Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );
            
            ResultSet rs = stmt.executeQuery(sql);
            
            // Check if movie exists and update
            if (rs.next()) {
                System.out.println("Found movie: " + rs.getString("title"));
                System.out.println("Current genre: " + rs.getString("genre"));
                
                // Update genre to Fiction
                rs.updateString("genre", "Fiction");
                rs.updateRow();
                
                System.out.println("Updated genre to: Fiction");
            } else {
                System.out.println("Movie 'Interstellar' not found in database.");
                System.out.println("Adding 'Interstellar' to demonstrate updatable ResultSet...");
                
                // First add the movie
                PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO MOVIE (title, genre) VALUES (?, ?)"
                );
                pstmt.setString(1, "Interstellar");
                pstmt.setString(2, "Sci-Fi");
                pstmt.executeUpdate();
                pstmt.close();
                
                // Now update using ResultSet
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    rs.updateString("genre", "Fiction");
                    rs.updateRow();
                    System.out.println("Genre updated to Fiction using updatable ResultSet!");
                }
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
        System.out.println("\nLab No.: 20");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}
