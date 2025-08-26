# Advanced Java Programming Questions (18-24)

This folder contains solutions for advanced Java programming concepts including JDBC, networking, and email handling.

## 📁 File Structure

### JDBC Database Programming
- **LabEighteen.java** - Database operations with MOVIE table
- **LabNineteen.java** - Scrollable ResultSet navigation
- **LabTwenty.java** - Updatable ResultSet for data modification

### Network Programming
- **TCPServer.java** - TCP server implementation
- **TCPClient.java** - TCP client implementation  
- **UDPEchoServer.java** - UDP echo server
- **UDPEchoClient.java** - UDP echo client

### Web & Email Programming
- **LabTwentyThree.java** - URL object creation and analysis
- **LabTwentyFour.java** - Email sending using JavaMail API

### Documentation
- **README_Solutions.md** - Detailed solutions documentation

## 🚀 Quick Start

### Prerequisites

1. **Java Development Kit (JDK) 8 or higher**
2. **MySQL Database** (for JDBC programs)
3. **JavaMail API** (for email program)

### Database Setup (for Questions 18-20)

```sql
-- Create database
CREATE DATABASE moviedb;
USE moviedb;

-- Create MOVIE table
CREATE TABLE MOVIE (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    genre VARCHAR(50) NOT NULL
);
```

### Running the Programs

#### 1. URL Demonstration (Question 23)
```bash
javac LabTwentyThree.java
java LabTwentyThree
```

#### 2. TCP Socket Communication (Question 21)
```bash
# Terminal 1 (Server)
javac TCPServer.java
java TCPServer

# Terminal 2 (Client)
javac TCPClient.java
java TCPClient
```

#### 3. UDP Echo Communication (Question 22)
```bash
# Terminal 1 (Server)
javac UDPEchoServer.java
java UDPEchoServer

# Terminal 2 (Client)
javac UDPEchoClient.java
java UDPEchoClient
```

#### 4. JDBC Programs (Questions 18-20)
```bash
# First ensure MySQL is running and database is created
javac -cp "mysql-connector-java.jar;." LabEighteen.java
java -cp "mysql-connector-java.jar;." LabEighteen
```

## 📋 Question Details

| Question | Topic | File(s) | Dependencies |
|----------|-------|---------|--------------|
| 18 | JDBC Operations | LabEighteen.java | MySQL Connector |
| 19 | Scrollable ResultSet | LabNineteen.java | MySQL Connector |
| 20 | Updatable ResultSet | LabTwenty.java | MySQL Connector |
| 21 | TCP Sockets | TCPServer.java, TCPClient.java | None |
| 22 | UDP Communication | UDPEchoServer.java, UDPEchoClient.java | None |
| 23 | URL Objects | LabTwentyThree.java | None |
| 24 | Email Sending | LabTwentyFour.java | JavaMail API |

## 🔧 Dependencies

### Maven Dependencies

```xml
<!-- MySQL Connector -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>

<!-- JavaMail API -->
<dependency>
    <groupId>javax.mail</groupId>
    <artifactId>mail</artifactId>
    <version>1.4.7</version>
</dependency>
```

### Download Links
- [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)
- [JavaMail API](https://javaee.github.io/javamail/)

## 🎯 Learning Objectives

- **JDBC Programming**: Database connectivity and operations
- **Network Programming**: TCP/UDP socket communication
- **Web Programming**: URL handling and parsing
- **Email Integration**: SMTP configuration and email sending
- **ResultSet Navigation**: Scrollable and updatable result sets
- **Exception Handling**: Proper error management in networked applications

## 📝 Notes

- All programs include proper error handling
- Student information is embedded in each program
- Resource management follows best practices
- Programs are designed for educational purposes
- Some programs require external services (database, email server)

## 🎓 Student Information

- **Name**: Sudhir Sharma
- **Roll No**: 53
- **Section**: B

---

For detailed implementation explanations, see `README_Solutions.md`
