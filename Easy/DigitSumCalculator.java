package Easy;

// 9. Summing Digits of a Number  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to calculate the sum of digits of a number.  
// Example:  
//    Input: `number = 1234`  
//    Output: `10`  
//    Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.  

import java.util.*;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Get the last digit and add it to sum
            num /= 10; // Remove the last digit
        }
        System.out.print("Sum of digits is: " + sum);
        sc.close();
    }
}
