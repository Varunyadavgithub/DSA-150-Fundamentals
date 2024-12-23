package Easy;

// 54. Finding the Largest Element in Each Row of a Matrix  
// Difficulty: Easy  
// Topics: Matrix Operations  
// Description: Write a program to find the largest element in each row of a matrix.  
// Example:  
//     Input: `matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]`  
//     Output: `[3, 6, 9]`  
//     Explanation: The largest elements in each row are 3, 6, and 9.

import java.util.Scanner;
public class LargestInRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.print("Enter the elements of the matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("The largest elements in each row are: ");
        for(int i=0;i<rows;i++){
            int max=matrix[i][0];
            for(int j=1;j<cols;j++){
                if (matrix[i][j]>max) {
                    max=matrix[i][j];
                }
            }
            System.out.println("Row "+(i+1)+": "+max);
        }
        sc.close();
    }
}
