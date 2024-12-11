package Easy;

import java.util.Scanner;

// 33. Finding the N-th Triangular Number  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to find the N-th triangular number.  
// Example:  
//     Input: `N = 4`  
//     Output: `10`  
//     Explanation: The 4th triangular number is 10 (sum of the first 4 natural numbers).

public class TriangularNumber {
    public static int calculateTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        int triangularNumber = calculateTriangularNumber(num);
        System.out.println("The " + num + "-th triangular number is: " + triangularNumber);
        sc.close();
    }
}
