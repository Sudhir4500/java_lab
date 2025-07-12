class Outer {
    void outerMethod() {
        final int localVar = 40;
        
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class:");
                System.out.println("Local variable: " + localVar);
            }
        }
        
        LocalInner inner = new LocalInner();
        inner.display();
    }
}

public class LabSevenC {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
        
        System.out.println("\nLab No.: 7c");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}