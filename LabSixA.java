class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class overridden method");
    }
}

public class LabSixA {
    public static void main(String[] args) {
        System.out.println("Demonstrating Method Overriding:");
        Parent obj = new Child(); // Parent reference, Child object
        obj.display(); // Calls Child's overridden method

        // Printing lab info
        System.out.println("\nLab No.: 6a");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}