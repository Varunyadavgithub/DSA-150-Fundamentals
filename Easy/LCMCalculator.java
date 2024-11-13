package Easy;

// 11. Finding the Least Common Multiple (LCM)  
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to find the LCM of two numbers.  
// Example:  
//     Input: `a = 12, b = 15`  
//     Output: `60`  
//     Explanation: The LCM of 12 and 15 is 60.  

import java.util.*;

public class LCMCalculator {
    public static int findGCD(int num1,int num2){
        while (num2!=0) {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        int lcm = Math.abs(num1 * num2) / gcd;
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}
