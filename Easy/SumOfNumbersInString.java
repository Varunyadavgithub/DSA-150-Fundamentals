package Easy;

// 43. Finding the Sum of Numbers in a String  
// Difficulty: Easy  
// Topics: String Manipulation  
// Description: Write a program to extract and sum all numbers present in a given string.  
// Example:  
//     Input: `string = "The numbers are 12 and 34"`  
//     Output: `46`  
//     Explanation: The sum of numbers 12 and 34 is 46.

import java.util.Scanner;
public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input=sc.nextLine();
        int sum=0;
        String temp="";
        for(char c:input.toCharArray()){
            if (Character.isDigit(c)) {
                temp+=c;
            }else{
                if (!temp.isEmpty()) {
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if (!temp.isEmpty()) {
            sum+=Integer.parseInt(temp);
        }
        System.out.print("The sum of number in the string is: "+sum);
        sc.close();
    }
}
