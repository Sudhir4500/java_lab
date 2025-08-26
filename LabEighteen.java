import java.sql.*;

public class LabEighteen {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/moviedb";
    private static final String USER = "root";
    private static final String PASS = "password";
    
    public static void main(String[] args) {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database successfully!");
            
            // Part a: Add three records to MOVIE table
            addMovieRecords(conn);
            
            // Part b: Update genre using prepared statement
            updateMovieGenre(conn);
            
            conn.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
        
        // Print lab info
        System.out.println("\nLab No.: 18");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
    
    private static void addMovieRecords(Connection conn) throws SQLException {
        String sql = "INSERT INTO MOVIE (id, title, genre) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        // Add first movie
        pstmt.setInt(1, 1);
        pstmt.setString(2, "Jatra");
        pstmt.setString(3, "Drama");
        pstmt.executeUpdate();
        
        // Add second movie
        pstmt.setInt(1, 2);
        pstmt.setString(2, "Inception");
        pstmt.setString(3, "Sci-Fi");
        pstmt.executeUpdate();
        
        // Add third movie
        pstmt.setInt(1, 3);
        pstmt.setString(2, "Avatar");
        pstmt.setString(3, "Action");
        pstmt.executeUpdate();
        
        System.out.println("Three movie records added successfully!");
        pstmt.close();
    }
    
    private static void updateMovieGenre(Connection conn) throws SQLException {
        String sql = "UPDATE MOVIE SET genre = ? WHERE title = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, "Comedy");
        pstmt.setString(2, "Jatra");
        
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Movie genre updated successfully!");
        }
        
        pstmt.close();
    }
}
