// 43. Finding the Sum of Prime Factors of a Number.  
// Difficulty: Medium  
// Topics: Number Theory, Mathematical Computations  
// Description: Write a program to find the sum of the prime factors of a given number.  
// Example:  
//      Input: `number = 12`  
//      Output: `5`  
// Explanation: The prime factors of 12 are 2 and 3, and their sum is 2 + 3 = 5.

import java.util.Scanner;

public class SumOfPrimeFactors {
    public static int sumOfPrimeFactors(int num) {
        int sum = 0;

        // Check for the factor of 2 (smallest prime number)
        if (num % 2 == 0) {
            sum += 2; // Add 2 to the sum
            while (num % 2 == 0) {
                num /= 2; // Divide the number by 2 repeatedly
            }
        }

        // Now check for odd factors from 3 upwards
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                sum += i; // Add the prime factor to the sum
                while (num % i == 0) {
                    num /= i; // Divide the number by the prime factor repeatedly
                }
            }
        }

        // If number is still greater than 2, it must be prime
        if (num > 2) {
            sum += num; // Add the remaining prime factor
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = sumOfPrimeFactors(number);
        System.out.print("The sum of prime factors of " + number + " is: " + sum);
        sc.close();
    }
}
