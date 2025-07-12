import java.io.*;

class Student implements Serializable {
    String name;
    int roll;
    
    Student(String n, int r) {
        name = n;
        roll = r;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Roll: " + roll;
    }
}

public class LabElevenC {
    public static void main(String[] args) throws Exception {
        // Serialization
        Student s1 = new Student("Sudhir", 53);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(s1);
        oos.close();
        
        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s2 = (Student)ois.readObject();
        System.out.println("Deserialized: " + s2);
        
        System.out.println("\nLab No.: 11c");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}