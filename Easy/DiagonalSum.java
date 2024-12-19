package Easy;

import java.util.Scanner;

// 45. Finding the Sum of Diagonal Elements in a Matrix  
// Difficulty: Easy  
// Topics: Matrix Operations  
// Description: Write a program to calculate the sum of the diagonal elements in a square matrix.  
// Example:  
//     Input: `matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]`  
//     Output: `15`  
//     Explanation: The sum of the diagonal elements (1 + 5 + 9) is 15.

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n X n): ");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.print("Enter the elements of the matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int diagonalSum=0;
        for(int i=0;i<n;i++){
            diagonalSum+=matrix[i][i];
        }
        System.out.println("The sum of the diagonal elements is: " + diagonalSum);
        sc.close();
    }
}
