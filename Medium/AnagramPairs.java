// 33. Checking for Anagram Pairs in a List of Strings.  
// Difficulty: Medium  
// Topics: String Manipulation  
// Description: Write a program to find pairs of strings in a list that are anagrams of each other.  
// Example:  
//     Input: `strings = ["listen", "silent", "hello", "world"]`  
//     Output: `[["listen", "silent"]]`  
//     Explanation: "listen" and "silent" are anagrams.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnagramPairs {
    public static List<List<String>> findAnagramPairs(String[] str) {
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (areAnagrams(str[i], str[j])) {
                    res.add(Arrays.asList(str[i], str[j]));
                }
            }
        }
        return res;
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] strings = new String[n];
        System.out.print("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        List<List<String>> anagramPairs = findAnagramPairs(strings);
        System.out.print("Anagram Pairs: " + anagramPairs);
        sc.close();
    }
}
