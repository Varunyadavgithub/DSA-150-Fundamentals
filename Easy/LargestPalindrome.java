package Easy;

import java.util.Scanner;

// 29. Finding the Largest Palindrome in a String  
// Difficulty: Easy  
// Topics: Basic Programming, String Manipulation  
// Description: Write a program to find the largest palindrome in a given string.  
// Example:  
//     Input: `string = "babad"`  
//     Output: `"bab"` or `"aba"`  
//     Explanation: Both "bab" and "aba" are valid palindromes in the string.

public class LargestPalindrome {
    public static String findLargestPalindrom(String str) {
        String largestPalindrom = "";
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            // check for odd-length palindromes
            String oddPalindrome = expandAroundCenter(str, i, i);
            if (oddPalindrome.length() > maxLength) {
                largestPalindrom = oddPalindrome;
                maxLength = oddPalindrome.length();
            }
            // check for even-length palindrome
            String evenPalindrome = expandAroundCenter(str, i, i + 1);
            if (evenPalindrome.length() > maxLength) {
                largestPalindrom = evenPalindrome;
                maxLength = evenPalindrome.length();
            }
        }
        return largestPalindrom;
    }

    public static String expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String ans = findLargestPalindrom(str);
        System.out.println("The largest palindrom of a string is: " + ans);
        sc.close();
    }
}
