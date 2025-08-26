import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MagicSquareChecker {
  public static void main(String[] args){
    int[][] matrix=new int[3][3];
    try{
        Scanner scanner = new Scanner(new File("magic.txt"));
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(scanner.hasNextInt()){
                    matrix[i][j]=scanner.nextInt();
                }
                else{
                    System.out.println("not enough numbers in the file.");
                    return;
                }
            }
        }

        int targetsum=matrix[0][0]+matrix[0][1]+matrix[0][2];
        
        // Check if it's a magic square
        boolean isMagic = checkMagicSquare(matrix, targetsum);
        
        // Display the matrix
        System.out.println("Matrix:");
        displayMatrix(matrix);
        
        // Display result
        if(isMagic) {
            System.out.println("This is a magic square with sum: " + targetsum);
        } else {
            System.out.println("This is not a magic square.");
        }
        
        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + e.getMessage());
    }
  }
  
  // Method to check if the matrix is a magic square
  public static boolean checkMagicSquare(int[][] matrix, int targetSum) {
      // Check all rows
      for(int i = 0; i < 3; i++) {
          int rowSum = matrix[i][0] + matrix[i][1] + matrix[i][2];
          if(rowSum != targetSum) {
              return false;
          }
      }
      
      // Check all columns
      for(int j = 0; j < 3; j++) {
          int colSum = matrix[0][j] + matrix[1][j] + matrix[2][j];
          if(colSum != targetSum) {
              return false;
          }
      }
      
      // Check main diagonal (top-left to bottom-right)
      int diagonal1Sum = matrix[0][0] + matrix[1][1] + matrix[2][2];
      if(diagonal1Sum != targetSum) {
          return false;
      }
      
      // Check anti-diagonal (top-right to bottom-left)
      int diagonal2Sum = matrix[0][2] + matrix[1][1] + matrix[2][0];
      if(diagonal2Sum != targetSum) {
          return false;
      }
      
      return true;
  }
  
  // Method to display the matrix
  public static void displayMatrix(int[][] matrix) {
      for(int i = 0; i < 3; i++) {
          for(int j = 0; j < 3; j++) {
              System.out.print(matrix[i][j] + "\t");
          }
          System.out.println();
      }
      System.out.println();
  }
}