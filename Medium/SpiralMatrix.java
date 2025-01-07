// 20. Generating a Matrix with a Spiral Pattern.  
// Difficulty: Medium  
// Topics: Arrays, Matrix Operations  
// Description: Write a program to generate a matrix filled with numbers in a spiral pattern.  
// Example:  
//     Input: `size = 3`  
//     Output:
//     1 2 3
//     8 9 4
//     7 6 5

import java.util.Scanner;

public class SpiralMatrix {
    public static int[][] generateSpiralMatrix(int size) {
        int[][] matrinx = new int[size][size];
        int value = 1; // Start filling from 1
        int top = 0, bottom = size - 1, left = 0, right = size - 1;
        while (top <= bottom && left <= right) {
            // Fill the top row (left to right)
            for (int i = left; i <= right; i++) {
                matrinx[top][i] = value++;
            }
            top++;
            // Fill the right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                matrinx[i][right] = value++;
            }
            right--;
            // Fill the bottom row (right to left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrinx[bottom][i] = value++;
                }
                bottom--;
            }
            // Fill the left column (bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrinx[i][left] = value++;
                }
                left++;
            }
        }
        return matrinx;
    }

    public static void printMatrix(int[][] matrinx) {
        for (int[] row : matrinx) {
            for (int elm : row) {
                System.out.print(elm + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int size = sc.nextInt();
        int[][] spiralMatrinx = generateSpiralMatrix(size);
        System.out.println("Generate Sprial Matrix: ");
        printMatrix(spiralMatrinx);
        sc.close();
    }
}
