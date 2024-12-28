// 4. Generating a Square Matrix of a Given Size.  
// Difficulty: Medium  
// Topics: Arrays, Matrix Operations  
// Description: Write a program to generate a square matrix of a given size and fill it with sequential numbers.  
// Example:  
//     Input: `size = 3`  
//     Output:
//              1 2 3
//              4 5 6
//              7 8 9
//     Explanation: A 3x3 matrix is generated with sequential numbers.

import java.util.Scanner;

public class SquareMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        int n = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = n++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = generateMatrix(n);
        printMatrix(matrix);
        sc.close();
    }
}
