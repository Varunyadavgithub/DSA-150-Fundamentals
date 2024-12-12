package Easy;

import java.util.Scanner;

// 39. Finding the Sum of Digits of a Number Until Zero  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to repeatedly sum the digits of a number until the result is zero.  
// Example:  
//    Input: `number = 123`  
//    Output: `6`  
//    Explanation: Sum of digits is 1 + 2 + 3 = 6; sum of digits of 6 is 6 (which is a single digit).

public class SumOfDigits {
    public static int sumDigitsUntilSingleDigit(int num){
        while (num>10) {
            num=sumOfDigits(num);
        }
        return num;
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while (num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int res=sumDigitsUntilSingleDigit(num);
        System.out.print("The single-digit sum is: "+res);
        sc.close();
    }
}
