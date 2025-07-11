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
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + e.getMessage());
    }
  }
}