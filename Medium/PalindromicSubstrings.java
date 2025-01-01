// 12. Counting the Number of Palindromic Substrings in a String.  
// Difficulty: Medium  
// Topics: String Manipulation  
// Description: Write a program to count how many palindromic substrings exist in a given string.  
// Example:  
//     Input: `string = "aaa"`  
//     Output: `6`  
//     Explanation: Palindromic substrings are "a", "a", "a", "aa", "aa", "aaa".

import java.util.Scanner;

public class PalindromicSubstrings {
    public static int countPalindromeSubstrings(String str) {
        int n = str.length();
        int count = 0;
        // Loop to check for palindromes centered at each index
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            // Expand around the center
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int res = countPalindromeSubstrings(str);
        System.out.println("The number of palindromic substrings is: " + res);
        sc.close();
    }
}
