// 14. Finding the Number of Perfect Numbers Up to a Given Limit.
// Difficulty: Medium  
// Topics: Number Theory  
// Description: Write a program to find how many perfect numbers exist up to a given limit.  
// Example:  
//     Input: `limit = 30`  
//     Output: `2`  
//     Explanation: There is only one perfect number (6) up to 30.

import java.util.Scanner;

public class PerfectNumbers {
    public static int countPerfectNumber(int limit) {
        int count = 0;
        // Check each number from 2 to the limit
        for (int i = 2; i < limit; i++) {
            if (isPerfectNumber(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 1; // Start with 1 b/c it is a divisor of every number.
        // check all divisor up to sqrt(num)
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i)) { // If divisors are equal, and it only once
                    sum += i;
                } else {
                    sum += i + (num / i); // Add both divisor
                }
            }
        }
        // Check is the sum of divisors equals to number
        return sum == num && num != 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        int count = countPerfectNumber(limit);
        System.out.print("Number of perfect numbers up to " + limit + ": " + count);
        sc.close();
    }
}
