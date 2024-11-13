package Easy;

// 12. Counting Vowels and Consonants in a String  
// Difficulty: Easy  
// Topics: Basic Programming, String Manipulation  
// Description: Write a program to count vowels and consonants in a given string.  
// Example:  
//     Input: `string = "hello world"`  
//     Output: `Vowels: 3, Consonants: 7`  
//     Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d). 

import java.util.*;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
        sc.close();
    }
}
