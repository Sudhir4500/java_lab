class Parent {
    Parent() {
        System.out.println("Parent class constructor called.");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent class constructor
        System.out.println("Child class constructor called.");
    }
}

public class LabFiveA {
    public static void main(String[] args) {
        System.out.println("Demonstrating super() for constructor:");
        Child obj = new Child();

        // Printing lab info
        System.out.println("\nLab No.: 5a");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}