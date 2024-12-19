package Easy;

// 53. Finding the Count of Digits Greater Than a Specific Value  
// Difficulty: Easy  
// Topics: Mathematical Computations  
// Description: Write a program to count how many digits in a number are greater than a specific value.  
// Example:  
//     Input: `number = 54321`, `value = 3`  
//     Output: `2`  
//     Explanation: The digits greater than 3 in 54321 are 5, 4, and 4, so the count is 2.

import java.util.Scanner;

public class CountDigitsGreaterThanValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the specific value: ");
        int value = sc.nextInt();
        String numstr = Integer.toString(num);
        int count = 0;
        for (int i = 0; i < numstr.length(); i++) {
            int digit = Character.getNumericValue(numstr.charAt(i));
            if (digit > value) {
                count++;
            }
        }
        System.out.println("The count of digits greater than " + value + " is: " + count);
        sc.close();
    }
}
