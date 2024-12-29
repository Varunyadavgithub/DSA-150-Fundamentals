// 7. Determining the Length of a String Without Using Built-In Functions  
// Difficulty: Medium  
// Topics: String Manipulation  
// Description: Write a program to determine the length of a string without using built-in functions.  
// Example:  
//     Input: `string = "hello"`  
//     Output: `5`  
//     Explanation: The length of the string "hello" is determined without using built-in functions.

import java.util.Scanner;

public class StringLength {
    public static int findLength(String str){
        int length=0;
        for(char ch:str.toCharArray()){
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = findLength(str);
        System.out.print("The length of the string is: " + length);
        sc.close();
    }
}
