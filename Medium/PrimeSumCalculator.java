// 17. Finding the Sum of the First N Prime Numbers.  
// Difficulty: Medium  
// Topics: Prime Numbers, Mathematical Computations  
// Description: Write a program to calculate the sum of the first N prime numbers.  
// Example:  
//     Input: `N = 4`  
//     Output: `17`  
//     Explanation: The sum of the first 4 prime numbers (2 + 3 + 5 + 7) is 17.

import java.util.Scanner;

public class PrimeSumCalculator {
    public static int calculateSumOfFirstNPrimes(int n) {
        int sum = 0, count = 0, num = 2;
        // Keep finding primes until we have N of them
        while (count < n) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
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
        System.out.print("Enter the number of primes (N): ");
        int n = sc.nextInt();
        int sum = calculateSumOfFirstNPrimes(n);
        System.out.println("The sum of the first " + n + " prime numbers is: " + sum);
        sc.close();
    }
}
