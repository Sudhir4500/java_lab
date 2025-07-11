public class Box {
    // Instance variables
    double length, breadth, height;

    // Constructor
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to print dimensions
    public void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }

    // Method to print volume
    public void printVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        // Create two Box objects
        Box box1 = new Box(10.0, 5.0, 3.0);
        Box box2 = new Box(7.0, 4.0, 2.0);

        // Call methods for box1
        System.out.println("Box 1 Details:");
        box1.printDimensions();
        box1.printVolume();

        // Call methods for box2
        System.out.println("\nBox 2 Details:");
        box2.printDimensions();
        box2.printVolume();

        // Print required lab information
        System.out.println("\nLab No.: 1");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No: 53");
        System.out.println("Section: B");
    }
}