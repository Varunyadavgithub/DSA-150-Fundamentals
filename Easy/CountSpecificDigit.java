package Easy;

// 36. Finding the Count of Specific Digits in a Number  
// Difficulty: Easy  
// Topics: Basic Programming, String Manipulation  
// Description: Write a program to count the occurrences of a specific digit in a number.  
// Example:  
//     Input: `number = 122333`, `digit = 3`  
//     Output: `3`  
//     Explanation: The digit 3 occurs 3 times in the number 122333.

import java.util.Scanner;
public class CountSpecificDigit {
    public static int countDigitOccurrences(long num, int digit) {
        int count = 0;
        num = Math.abs(num);
        while (num > 0) {
            long countDigit = num % 10;
            if (countDigit == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextInt();
        System.out.print("Enter digit to count: ");
        int digit = sc.nextInt();
        int count = countDigitOccurrences(num, digit);
        System.out.print("The digit " + digit + " occurs " + count + " time(s) in the number " + num + ".");
        sc.close();
    }
}
