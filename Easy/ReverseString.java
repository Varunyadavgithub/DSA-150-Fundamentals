package Easy;

// 13. Reversing a String  
// Difficulty: Easy  
// Topics: Basic Programming, String Manipulation  
// Description: Write a program to reverse a given string.  
// Example:  
//     Input: `string = "programming"`  
//     Output: `"gnimmargorp"`  
//     Explanation: The reversed string of "programming" is "gnimmargorp".  

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String rev = reverseString(input);
        System.out.print("Reversed string is: " + rev);
        sc.close();
    }

    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
