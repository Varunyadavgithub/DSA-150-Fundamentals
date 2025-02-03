package Hard;

import java.util.Scanner;

// 2: Print a Matrix with Zigzag Pattern.
// Difficulty: Hard  
// Topics: Matrix Pattern  
// Hint: Print a matrix with a zigzag pattern of numbers. The numbers should alternate direction row-wise.
// Example 1:
//      Input: `n = 3, m = 4`  
//      Output:
//          1 2 3 4
//          8 7 6 5
//          9 10 11 12

public class ZigzagMatrix {
    public static void printZigzagMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Fill left to right
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                // Fill right to left
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int m = scanner.nextInt();
        scanner.close();

        printZigzagMatrix(n, m);
    }
}
