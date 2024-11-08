package Easy;

// 2. Checking for Prime Numbers  
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to determine if a number is prime.  
// Example:  
//    Input: `number = 7`  
//    Output: `Prime`  
//    Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.  

import java.util.*;

public class PrimeCheck {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
        sc.close();
    }
}
