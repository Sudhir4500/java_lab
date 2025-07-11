import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        // Declare a jagged array (2D array with variable column sizes)
        int[][] jaggedArray = new int[3][];

        // Initialize each row with different column sizes
        jaggedArray[0] = new int[2]; // First row has 2 columns
        jaggedArray[1] = new int[4]; // Second row has 4 columns
        jaggedArray[2] = new int[3]; // Third row has 3 columns

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input elements for the jagged array
        System.out.println("Enter elements for the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Row " + i + " (" + jaggedArray[i].length + " elements):");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Display the jagged array
        System.out.println("\nThe Jagged Array is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "\t");
            }
            System.out.println();
        }

        // Print required lab information
        System.out.println("\nLab No.: 2b");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No: 53");
        System.out.println("Section: B");

        scanner.close();
    }
}