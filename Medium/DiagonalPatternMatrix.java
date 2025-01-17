// 29. Generating a Matrix with a Diagonal Pattern.  
// Difficulty: Medium  
// Topics: Matrix Operations  
// Description: Write a program to create a matrix where elements form diagonal lines of a given pattern.  
// Example:  
//     Input: `size = 4`  
//     Output:

//     ```
//     1 0 0 0
//     1 1 0 0
//     1 1 1 0
//     1 1 1 1
//     ```

import java.util.Scanner;

public class DiagonalPatternMatrix {
    public static int[][] generateDiagonalPatternMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = sc.nextInt();
        int[][] matrix = generateDiagonalPatternMatrix(size);
        System.out.println("Generated Matrix:");
        printMatrix(matrix);
        sc.close();
    }
}
