package Easy;

import java.util.Scanner;

// 37. Finding All Divisors of a Number  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to find all divisors of a given number.  
// Example:  
//     Input: `number = 12`  
//     Output: `1, 2, 3, 4, 6, 12`  
//     Explanation: The divisors of 12 are 1, 2, 3, 4, 6, and 12.

public class DivisorsOfNumber {
    public static void findDivisors(int num) {
        num = Math.abs(num);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("The divisor of " + num + " are: ");
        findDivisors(num);
        sc.close();
    }
}
