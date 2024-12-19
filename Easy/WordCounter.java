package Easy;

// 51. Finding the Number of Words in a String  
// Difficulty: Easy  
// Topics: String Manipulation  
// Description: Write a program to count the number of words in a given string.  
// Example:  
//     Input: `string = "Hello world"`  
//     Output: `2`  
//     Explanation: There are 2 words in the string.

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        String[] words = inputString.trim().split("\\s+");
        int wordCount = words.length;
        if (inputString.trim().isEmpty()) {
            wordCount = 0;
        }
        System.out.println("The number of words in the string is: " + wordCount);
        sc.close();
    }
}
