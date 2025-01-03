// 15. Finding the Largest Prime Factor of a Number.
// Difficulty: Medium  
// Topics: Number Theory  
// Description: Write a program to find the largest prime factor of a given number.  
// Example:  
//     Input: `number = 28`  
//     Output: `7`  
//     Explanation: The prime factors of 28 are 2 and 7, with the largest being 7.

import java.util.Scanner;

public class LargestPrimeFactor {
    public static int largestPrimeFactor(int num) {
        int largestFactor = -1;
        // Check for factor of 2
        while (num % 2 == 0) {
            largestFactor = 2;
            num /= 2;
        }
        // Check for odd factors from 3 to sqrt(num)
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }
        // If num is still greater than 2, it is a prime number.
        if (num > 2) {
            largestFactor = num;
        }
        return largestFactor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = largestPrimeFactor(num);
        System.out.println("The largest prime factor is: " + result);
        sc.close();
    }
}
