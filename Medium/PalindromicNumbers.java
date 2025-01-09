// 22. Checking for Palindromic Numbers in a Range.  
// Difficulty: Medium  
// Topics: Mathematical Computations  
// Description: Write a program to check for palindromic numbers within a given range.  
// Example:  
//     Input: `start = 1`, `end = 100`  
//     Output: `[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99]`  
//     Explanation: Palindromic numbers between 1 and 100 are the numbers listed.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromicNumbers {
    public static boolean isPalindrome(int numbers) {
        String strNum = Integer.toString(numbers);
        String reverseStr = new StringBuilder(strNum).reverse().toString();
        return strNum.equals(reverseStr);
    }

    public static List<Integer> findPalindromicNumbers(int start, int end) {
        List<Integer> palindrommicNumber = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (isPalindrome(i)) {
                palindrommicNumber.add(i);
            }
        }
        return palindrommicNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the start value: ");
        int start = sc.nextInt();
        System.out.print("Enter the end value: ");
        int end = sc.nextInt();
        List<Integer> res = findPalindromicNumbers(start, end);
        System.out.print("Palindromic Numbers: " + res);
        sc.close();
    }
}
