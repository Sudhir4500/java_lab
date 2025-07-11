import java.util.Scanner;

// Base class Student
class Student {
    int roll_no;
    
    void readRollNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
    }
    
    void displayRollNo() {
        System.out.println("Roll No: " + roll_no);
    }
}

// Test class inherits Student
class Test extends Student {
    int marks1, marks2;
    
    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks for Subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter Marks for Subject 2: ");
        marks2 = sc.nextInt();
    }
    
    void displayMarks() {
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
    }
}

// Result class inherits Test
class Result extends Test {
    int total;
    
    void calculateTotal() {
        total = marks1 + marks2;
    }
    
    void displayTotal() {
        System.out.println("Total Marks: " + total);
    }
}

public class LabFour {
    public static void main(String[] args) {
        // Creating object of Result class
        Result studentResult = new Result();
        
        System.out.println("Enter Student Details:");
        studentResult.readRollNo();
        studentResult.readMarks();
        
        System.out.println("\nDisplaying Student Details:");
        studentResult.displayRollNo();
        studentResult.displayMarks();
        
        studentResult.calculateTotal();
        studentResult.displayTotal();
        
        // Printing lab info
        System.out.println("\nLab No.: 4");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}