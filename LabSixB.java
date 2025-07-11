abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
    
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class LabSixB {
    public static void main(String[] args) {
        System.out.println("Demonstrating Runtime Polymorphism:");
        
        Shape shape; // Parent reference
        
        shape = new Rectangle(5, 4); // Rectangle object
        System.out.println("Area of Rectangle: " + shape.area());
        
        shape = new Triangle(3, 6); // Triangle object
        System.out.println("Area of Triangle: " + shape.area());

        // Printing lab info
        System.out.println("\nLab No.: 6b");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}