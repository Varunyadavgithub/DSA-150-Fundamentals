package Medium;

// 3. Finding the Sum of Prime Numbers in a Range.  
// Difficulty: Medium  
// Topics: Number Theory, Mathematical Computations  
// Description: Write a program to calculate the sum of all prime numbers within a given range.  
// Example:  
//     Input: `range = [1, 10]`  
//     Output: `17`  
//     Explanation: The sum of prime numbers between 1 and 10 is 2 + 3 + 5 + 7 = 17.

import java.util.Scanner;

public class SumOfPrimes {
    public static int calculateSumOfPrimes(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        int sum = calculateSumOfPrimes(start, end);
        System.out.println("The sum of prime numbers between " + start + " and " + end + " is: " + sum);
        sc.close();
    }
}
