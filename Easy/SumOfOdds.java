package Easy;

// 22. Calculating the Sum of Odd Numbers in a Range  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to find the sum of all odd numbers within a given range.  
// Example:  
//     Input: `range = [1, 10]`  
//     Output: `25`  
//     Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.  

import java.util.*;

public class SumOfOdds {
    public static int calculateSumOfOdds(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
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
        int sum = calculateSumOfOdds(rangeStart, rangeEnd);
        System.out.println("The sum of odd numbers between " + rangeStart + " and " + rangeEnd + " is: " + sum);
        sc.close();
    }
}
