// 9. Finding the Longest Substring Without Repeating Characters.
// Difficulty: Medium  
// Topics: String Manipulation, Sliding Window  
// Description: Write a program to find the longest substring without repeating characters in a given string.  
// Example:  
//    Input: `string = "abcabcbb"`  
//    Output: `"abc"`  
//    Explanation: The longest substring without repeating characters is "abc".

import java.util.Scanner;

public class LongestUniqueSubstring {
    public static String findLongestUniqueSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        int currStart = 0;
        String longestSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character has appeared in the current window
            for (int j = currStart; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    currStart = j + 1; // Move the start of the window
                    break;
                }
            }
            // Update the longest substring if the current window is longer
            if (i - currStart + 1 > maxLength) {
                maxLength = i - currStart + 1;
                start = currStart;
            }
        }
        // Extract the longest substring
        longestSubstring = str.substring(start, start + maxLength);
        return longestSubstring;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        String res = findLongestUniqueSubstring(input);
        System.out.print("The longest substring without repeating characters is: \"" + res + "\"");
        sc.close();
    }
}