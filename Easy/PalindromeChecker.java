package Easy;

// 6. Identifying Palindromes**  
// Difficulty: Easy  
// Topics: Basic Programming, String Manipulation  
// Description: Write a program to check if a string or number is a palindrome.  
// Example:  
//    Input: `string = "radar"`  
//    Output: `Palindrome`  
//    Explanation: "radar" reads the same backward as forward.  

import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
