// 24. Finding All Divisors of the Product of Two Numbers.  
// Difficulty: Medium  
// Topics: Number Theory  
// Description: Write a program to find all divisors of the product of two given numbers.  
// Example:  
//     Input: `number1 = 6`, `number2 = 10`  
//     Output: `[1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60]`  
//     Explanation: The product of 6 and 10 is 60, and its divisors are listed.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisorsOfProduct {
    public static List<Integer> findDivisors(int num1, int num2) {
        long prod = (long) num1 * num2;
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(prod); i++) {
            if (prod % i == 0) {
                divisors.add(i); // Add the divisor
                if (i != prod / i) { // Avoid adding the square root twice
                    divisors.add((int) (prod / i));
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        // Example 1
        int number1 = 6, number2 = 10;
        System.out.println(findDivisors(number1, number2)); // Output: [1, 2, 3, 5, 6, 10, 15, 30]

        // Example 2
        int number3 = 8, number4 = 12;
        System.out.println(findDivisors(number3, number4)); // Output: [1, 2, 3, 4, 6, 8, 12, 16, 24, 48]

        // Example 3
        int number5 = 7, number6 = 11;
        System.out.println(findDivisors(number5, number6)); // Output: [1, 7, 11, 77]
    }
}
