package Easy;

import java.util.Scanner;

// 57. Finding the Length of the Longest Word in a String  
// Difficulty: Easy  
// Topics: String Manipulation  
// Description: Write a program to find the length of the longest word in a given string.  
// Example:  
//     Input: `string = "Find the longest word"`  
//     Output: `7`  
//     Explanation: The longest word is "longest" with length 7.

public class LongestWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        System.out.println("The length of the longest word is: " + maxLength);
        sc.close();
    }
}
