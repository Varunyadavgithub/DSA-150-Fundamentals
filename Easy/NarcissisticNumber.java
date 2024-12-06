package Easy;

import java.util.Scanner;

// 26. Checking if a Number is a Narcissistic Number  
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).  
// Example:  
//     Input: `number = 153`  
//     Output: `Narcissistic Number`  
//     Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153.

public class NarcissisticNumber {
    public static boolean isNarcissistic(int num){
        int originalNum=num;
        int sum=0;
        int digits=countDigits(num);
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit, digits);
            num/=10;
        }
        return originalNum==sum;
    }
    public static int countDigits(int num){
        return String.valueOf(Math.abs(num)).length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isNarcissistic(num)) {
            System.out.println(num + " is a Narcissistic Number");
        } else {
            System.out.println(num + " is not a Narcissistic Number");
        }
        sc.close();
    }
}
