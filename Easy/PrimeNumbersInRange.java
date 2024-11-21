package Easy;

// 19. Finding Prime Numbers in a Range  
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to find all prime numbers within a given range.  
// Example:  
//     Input: `range = [10, 30]`  
//     Output: `[11, 13, 17, 19, 23, 29]`  
//     Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.  

import java.util.*;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = sc.nextInt();
        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
