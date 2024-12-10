package Easy;

import java.util.Arrays;
import java.util.Scanner;

// 32. Checking for an Anagram  
// Difficulty: Easy  
// Topics: String Manipulation  
// Description: Write a program to check if two strings are anagrams.  
// Example:  
//     Input: `string1 = "listen"`, `string2 = "silent"`  
//     Output: `True`  
//     Explanation: "listen" and "silent" are anagrams of each other.

public class AnagramChecker {
    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        boolean isAnagram = checkAnagram(str1, str2);
        System.out.print(isAnagram);
        sc.close();
    }
}
