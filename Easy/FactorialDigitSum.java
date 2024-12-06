package Easy;

import java.math.BigInteger;
import java.util.Scanner;

// 28. Finding the Sum of the Digits of the Factorial of a Number
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to find the sum of the digits of the factorial of a given number.  
// Example:  
//     Input: `number = 4`  
//     Output: `6`  
//     Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6.

public class FactorialDigitSum {
    public static BigInteger calculateFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int sumOfDigits(BigInteger num) {
        int sum = 0;
        String numberString = num.toString();
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        BigInteger factorial = calculateFactorial(num);
        int sumOfDigits = sumOfDigits(factorial);
        System.out.println("The fatorial of " + num + " is: " + factorial);
        System.out.println("The Sum of the digits of the factorial is: " + sumOfDigits);
        sc.close();
    }
}
