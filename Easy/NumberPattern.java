package Easy;

import java.util.Scanner;

// 27. Generating a Pattern of Numbers  
// Difficulty: Easy  
// Topics: Basic Programming, Patterns  
// Description: Write a program to generate number patterns (e.g., sequential numbers in a matrix).  
// Example:  
//     Input: `rows = 3`  
//     Output:

//     ```
//     1
//     2 3
//     4 5 6
//     ```

//     Explanation: A number pattern with 3 rows is generated.

public class NumberPattern {
    public static void generatePattern(int rows){
        int num=1;
        for(int i=0;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        generatePattern(rows);
        sc.close();
    }
}
