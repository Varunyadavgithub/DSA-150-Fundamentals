// 27. Checking for a Repeated Substring in a String.  
// Difficulty: Medium  
// Topics: String Manipulation  
// Description: Write a program to check if a substring is repeated within a given string.  
// Example:  
//     Input: `string = "abab"`  
//     Output: `True`  
//     Explanation: The substring "ab" is repeated.

import java.util.Scanner;

public class RepeatedSubstring {
    public static boolean hasRepeatedSubstring(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String subString = s.substring(0, len);
                StringBuilder repeatedString = new StringBuilder();
                for (int i = 0; i < n / len; i++) {
                    repeatedString.append(subString);
                }
                if (repeatedString.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        boolean result = hasRepeatedSubstring(input);
        System.out.println("Does the string have a repeated substring? " + result);
        sc.close();
    }
}
