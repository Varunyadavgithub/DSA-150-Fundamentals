package Easy;

// 18. Generating Multiplication Tables  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to generate multiplication tables for a given number.  
// Example:  
//     Input: `number = 4`  
//     Output:  
//     ```
//     4 x 1 = 4  
//     4 x 2 = 8  
//     4 x 3 = 12  
//     4 x 4 = 16  
//     4 x 5 = 20  
//     ```  
//     Explanation: The multiplication table for 4 up to 5 is generated.  

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int num = sc.nextInt();
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
