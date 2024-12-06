package Easy;

import java.util.Scanner;

// 25. Finding the Number of Digits in a Number  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to count the number of digits in a given number.  
// Example:  
//     Input: `number = 12345`  
//     Output: `5`  
//     Explanation: The number 12345 has 5 digits.

public class CountDigits {
    public static int coutDigits(int num){
        num=Math.abs(num);
        if (num==0) {
            return 1;
        }
        int count = 0;
        while (num>0) {
            num/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int digits=coutDigits(num);
        System.out.print("The number of digits in the number is: "+digits);
        sc.close();
    }
}
