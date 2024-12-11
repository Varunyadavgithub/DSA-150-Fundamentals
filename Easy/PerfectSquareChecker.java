package Easy;

import java.util.Scanner;

// 34. Checking for Perfect Squares  
// Difficulty: Easy  
// Topics: Mathematical Computations  
// Description: Write a program to determine if a number is a perfect square.  
// Example:  
//     Input: `number = 16`  
//     Output: `True`  
//     Explanation: 16 is a perfect square (4^2 = 16).

public class PerfectSquareChecker {
    public static boolean checkPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean isPerfectSquare = checkPerfectSquare(n);
        if (isPerfectSquare) {
            System.out.print("True " + n + " is a perfect square.");
        } else {
            System.out.print("False " + n + " is not a perfect square.");
        }
        sc.close();
    }
}
