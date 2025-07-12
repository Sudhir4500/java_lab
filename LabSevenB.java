class Outer {
    int outerVar = 30;
    
    class Inner {
        void display() {
            System.out.println("Inner Class:");
            System.out.println("Outer variable: " + outerVar);
        }
    }
}

public class LabSevenB {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
        
        System.out.println("\nLab No.: 7b");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}