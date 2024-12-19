package Easy;

import java.util.Scanner;

// 52. Finding the Sum of the First N Even Numbers  
// Difficulty: Easy  
// Topics: Mathematical Computations  
// Description: Write a program to calculate the sum of the first N even numbers.  
// Example:  
//     Input: `N = 4`  
//     Output: `20`  
//     Explanation: The first 4 even numbers are 2, 4, 6, 8, and their sum is 20.

public class EvenNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
        sc.close();
    }
}
