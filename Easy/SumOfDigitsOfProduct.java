package Easy;

// 47. Finding the Sum of Digits of the Product of Two Numbers  
// Difficulty: Easy  
// Topics: Mathematical Computations  
// Description: Write a program to find the sum of the digits of the product of two given numbers.  
// Example:  
//     Input: `number1 = 12`, `number2 = 34`  
//     Output: `12`  
//     Explanation: The product of 12 and 34 is 408, and the sum of its digits is 4 + 0 + 8 = 12.

import java.util.Scanner;
public class SumOfDigitsOfProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        int product=num1*num2;
        int sumOfDigits=0;
        int temp=product;
        while (temp>0) {
            sumOfDigits+=temp%10;
            temp/=10;
        }
        System.out.println("The sum of the digits of the product is: " + sumOfDigits);
        sc.close();
    }
}
