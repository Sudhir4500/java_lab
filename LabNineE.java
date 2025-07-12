public class LabNineE {
    static void riskyMethod() throws ArithmeticException {
        System.out.println(10 / 0);
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e);
        }

        System.out.println("\nLab No.: 9e");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}