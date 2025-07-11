class Outer {
    static int outerStaticVar = 10;
    int outerInstanceVar = 20;
    
    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class:");
            System.out.println("Outer static variable: " + outerStaticVar);
            // System.out.println(outerInstanceVar); // Error - cannot access instance variable
        }
    }
}

public class LabSevenA {
    public static void main(String[] args) {
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.display();
        
        System.out.println("\nLab No.: 7a");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}