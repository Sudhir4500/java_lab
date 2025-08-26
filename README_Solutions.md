# Java Lab Solutions - Questions 18-24

## Summary of Solutions Created

### Question 18: JDBC Database Operations with MOVIE table
**File:** `LabEighteen.java`
- **Part A:** Adds three records to MOVIE table using PreparedStatement
- **Part B:** Updates genre to "Comedy" for movie with title "Jatra"
- **Features:** Database connection, PreparedStatement usage, error handling

### Question 19: Scrollable ResultSet Navigation
**File:** `LabNineteen.java`
- Creates scrollable ResultSet with TYPE_SCROLL_INSENSITIVE
- Demonstrates navigation to last row, first row, and third row
- Shows ResultSet positioning methods: last(), first(), absolute()

### Question 20: Updatable ResultSet for Data Modification
**File:** `LabTwenty.java`
- Creates updatable ResultSet with CONCUR_UPDATABLE
- Finds movie "Interstellar" and updates genre to "Fiction"
- Demonstrates direct database updates through ResultSet

### Question 21: TCP Socket Programming (Chat Application)
**Files:** `TCPServer.java` and `TCPClient.java`
- **Server:** Listens on port 8080, reads client message, sends response
- **Client:** Connects to server, sends user input, receives response
- **Features:** Socket programming, BufferedReader/PrintWriter usage

### Question 22: UDP Echo Server and Client
**Files:** `UDPEchoServer.java` and `UDPEchoClient.java`
- **Server:** Listens on port 9090, echoes received packets back to sender
- **Client:** Sends messages to server, receives echo responses
- **Features:** DatagramSocket, DatagramPacket, UDP communication

### Question 23: URL Object Creation and Analysis
**File:** `LabTwentyThree.java`
- Creates URL object for "https://www.example.com/index.html?user=test"
- Extracts and displays: protocol, host, port, file path, query
- **Updated:** Uses URI.create().toURL() to avoid deprecated constructor

### Question 24: Email Sending using JavaMail API
**File:** `LabTwentyFour.java`
- **Note:** Requires external JavaMail API dependency
- Demonstrates SMTP configuration for Gmail
- Shows email composition and sending structure
- **Features:** Properties setup, Session creation, Message composition

## Dependencies Required

### For JDBC Programs (Questions 18-20):
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
```

### For Email Program (Question 24):
```xml
<dependency>
    <groupId>javax.mail</groupId>
    <artifactId>mail</artifactId>
    <version>1.4.7</version>
</dependency>
```

## Database Setup for JDBC Programs

Create a MySQL database with MOVIE table:
```sql
CREATE DATABASE moviedb;
USE moviedb;

CREATE TABLE MOVIE (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    genre VARCHAR(50) NOT NULL
);
```

## Running Instructions

### For Socket Programs:
1. **TCP:** Run TCPServer first, then TCPClient
2. **UDP:** Run UDPEchoServer first, then UDPEchoClient

### For Database Programs:
1. Ensure MySQL is running
2. Update connection details (URL, username, password)
3. Create database and table as shown above

### For Email Program:
1. Add JavaMail dependency to classpath
2. Configure SMTP settings for your email provider
3. Use app-specific passwords for Gmail

## Notes
- All programs include proper error handling
- Resource management with try-catch blocks
- Student information included in each program
- Socket programs use localhost for demonstration
- JDBC programs use PreparedStatement for security

## Test Status
✅ LabTwentyThree.java - Compiled and tested successfully
⚠️ Other programs require external dependencies or services to run
