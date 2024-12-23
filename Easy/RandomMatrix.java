package Easy;

// 56. Generating a Matrix with Random Numbers  
// Difficulty: Easy  
// Topics: Random Number Generation, Matrix Operations  
// Description: Write a program to generate a matrix filled with random numbers.  
// Example:  
//     Input: `rows = 2`, `columns = 3`  
//     Output:  
//     ```
//     3 8 1  
//     7 4 6  
//     ```

import java.util.Random;
import java.util.Scanner;

public class RandomMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the numbers of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
