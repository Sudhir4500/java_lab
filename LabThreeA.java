class StaticExample {  
    // Static variable  
    static int counter = 0;  

    // Static block  
    static {  
        System.out.println("Static block executed.");  
    }  

    // Static method  
    static void displayCounter() {  
        System.out.println("Counter: " + counter);  
    }  

    // Constructor increments static counter  
    StaticExample() {  
        counter++;  
    }  
}  

public class LabThreeA {  
    public static void main(String[] args) {  
        System.out.println("Demonstrating static concepts:");  
        StaticExample obj1 = new StaticExample();  
        StaticExample obj2 = new StaticExample();  

        // Calling static method  
        StaticExample.displayCounter();  

        // Printing lab info  
        System.out.println("\nLab No.: 3a");  
        System.out.println("Name: Sudhir Sharma");  
        System.out.println("Roll No./Section: 53/B");  
    }  
}  