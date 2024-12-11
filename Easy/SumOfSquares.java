package Easy;

import java.util.Scanner;

// 35. Finding the Sum of Squares of Digits  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to find the sum of the squares of the digits of a number.  
// Example:  
//     Input: `number = 123`  
//     Output: `14`  
//     Explanation: The sum of the squares of digits is 1^2 + 2^2 + 3^2 = 14.

public class SumOfSquares {
    public static int calculateSumOfSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sumOfSquare = calculateSumOfSquare(n);
        System.out.print("The sum of a square is: " + sumOfSquare);
        sc.close();
    }
}
