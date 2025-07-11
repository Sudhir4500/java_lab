import java.util.Scanner;

public class Matrix3x3 {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Input matrix elements
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nThe 3x3 Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Display diagonal elements
        System.out.println("\nDiagonal Elements are:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        // Print required lab information
        System.out.println("\nLab No.: 2a");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No: 53");
        System.out.println("Section: B");

        scanner.close();
    }
}