-- SQL script to create test database and tables for Java Lab programs
-- Run this in MySQL Workbench or command line after installing MySQL

-- Create database
CREATE DATABASE IF NOT EXISTS testdb;
USE testdb;

-- Create students table for Lab 18-20
CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    grade VARCHAR(2)
);

-- Insert sample data
INSERT INTO students (name, age, grade) VALUES 
('John Doe', 20, 'A'),
('Jane Smith', 21, 'B'),
('Mike Johnson', 19, 'A'),
('Sarah Wilson', 22, 'C'),
('David Brown', 20, 'B');

-- Create employees table for additional testing
CREATE TABLE IF NOT EXISTS employees (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(50) NOT NULL,
    department VARCHAR(30),
    salary DECIMAL(10,2)
);

-- Insert sample employee data
INSERT INTO employees (emp_name, department, salary) VALUES
('Alice Cooper', 'IT', 55000.00),
('Bob Miller', 'HR', 48000.00),
('Carol Davis', 'Finance', 52000.00),
('Dan Wilson', 'IT', 58000.00);

-- Show the data
SELECT 'Students Table:' as Info;
SELECT * FROM students;

SELECT 'Employees Table:' as Info;
SELECT * FROM employees;

-- Grant privileges (if needed)
-- GRANT ALL PRIVILEGES ON testdb.* TO 'root'@'localhost';
-- FLUSH PRIVILEGES;
