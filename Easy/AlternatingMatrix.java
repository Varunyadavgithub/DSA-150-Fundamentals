package Easy;

import java.util.Scanner;

// 48. Generating a Matrix with Alternating 0s and 1s  
// Difficulty: Easy  
// Topics: Arrays, Matrix Operations  
// Description: Write a program to generate a matrix where the elements alternate between 0 and 1.  
// Example:  
//     Input: `size = 3`  
//     Output:  
//     ```
//     0 1 0  
//     1 0 1  
//     0 1 0  
//     ```

public class AlternatingMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int size=sc.nextInt();
        int[][] matrix=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=(i+j)%2;
            }
        }
        System.out.println("Generated matrix: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
