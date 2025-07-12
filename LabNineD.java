public class LabNineD {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("\nLab No.: 9d");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}