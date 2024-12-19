package Easy;

// 49. Finding the Count of a Specific Word in a String  
// Difficulty: Easy  
// Topics: String Manipulation  
// Description: Write a program to count how many times a specific word appears in a given string.  
// Example:  
//     Input: `string = "hello world hello"`  
//     Output: `2`  
//     Explanation: The word "hello" appears 2 times in the string.

import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString=sc.nextLine();
        System.out.print("Enter the word to count: ");
        String wordToFind=sc.next();
        String[] words=inputString.split("\\s+");
        int count=0;
        for(String word:words){
            if (word.equals(wordToFind)) {
                count++;
            }
        }
        System.out.println("The word \"" + wordToFind + "\" appears " + count + " times in the string.");
        sc.close();
    }
}
