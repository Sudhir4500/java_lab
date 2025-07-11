class Parent {
    String name = "Parent";
    
    void display() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    String name = "Child";
    
    void display() {
        super.display(); // Calls Parent's display()
        System.out.println("Child class method.");
        System.out.println("Parent's name: " + super.name); // Accesses Parent's name
        System.out.println("Child's name: " + name);
    }
}

public class LabFiveB {
    public static void main(String[] args) {
        System.out.println("Demonstrating super to access parent members:");
        Child obj = new Child();
        obj.display();

        // Printing lab info
        System.out.println("\nLab No.: 5b");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}