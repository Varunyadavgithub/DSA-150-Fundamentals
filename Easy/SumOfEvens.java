package Easy;

// 21. Calculating the Sum of Even Numbers in a Range  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to find the sum of all even numbers within a given range.  
// Example:  
//     Input: `range = [1, 10]`  
//     Output: `30`  
//     Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.  

import java.util.*;

public class SumOfEvens {
    public static int calculateSumOfEvens(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int rangeStart = sc.nextInt();
        System.out.print("Enter second number: ");
        int rangeEnd = sc.nextInt();
        int sum = calculateSumOfEvens(rangeStart, rangeEnd);
        System.out.println("The sum of even numbers between " + rangeStart + " and " + rangeEnd + " is: " + sum);
        sc.close();
    }
}
