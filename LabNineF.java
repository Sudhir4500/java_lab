class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class LabNineF {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be ≥ 18");
        }
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }

        System.out.println("\nLab No.: 9f");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
}