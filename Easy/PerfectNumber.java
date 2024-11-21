package Easy;

// 20. Checking for Perfect Numbers  
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to determine if a number is a perfect number.  
// Example:  
//     Input: `number = 28`  
//     Output: `Perfect Number`  
//     Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a perfect number: ");
        int num = sc.nextInt();
        if (isPerfect(num)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
        sc.close();
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
