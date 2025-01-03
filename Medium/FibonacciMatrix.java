// 16. Generating a Matrix of Fibonacci Numbers.
// Difficulty: Medium  
// Topics: Arrays, Matrix Operations  
// Description: Write a program to generate a matrix where each element is a Fibonacci number.  
// Example:  
//     Input: `size = 3`  
//     Output:

//     ```
//     1 1 2
//     3 5 8
//     13 21 34
//     ```

import java.util.Scanner;

public class FibonacciMatrix {
    public static void generateFibonacciMatrix(int size) {
        int[][] matrix = new int[size][size];
        int a = 0, b = 1;
        // Fill the matrix with fibonacci numbers
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = b; // Store the current Fibonacci number
                int next = a + b; // Calculate the next Fibonacci number
                a = b;
                b = next;
            }
        }

        // Print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = sc.nextInt();
        System.out.println("Fibonacci Matrix:");
        generateFibonacciMatrix(size);
        sc.close();
    }
}
