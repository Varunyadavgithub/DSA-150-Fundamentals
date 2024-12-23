package Easy;

import java.util.Scanner;

// 55. Finding the Frequency of Each Character in a String  
// Difficulty: Easy  
// Topics: String Manipulation  
// Description: Write a program to count the frequency of each character in a given string.  
// Example:  
//     Input: `string = "hello"`  
//     Output: `{'h': 1, 'e': 1, 'l': 2, 'o': 1}`  
//     Explanation: The frequency of each character in the string "hello" is shown.

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        int[] freq=new int[256];
        for(char ch:input.toCharArray()){
            freq[ch]++;
        }
        System.out.print("Character Frequencies: ");
        for(int i=0;i<256;i++){
            if (freq[i]>0) {
                System.out.print((char)i+": "+freq[i]+" ");
            }
        }
        sc.close();
    }
}
