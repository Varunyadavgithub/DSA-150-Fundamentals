package Easy;

import java.util.Scanner;

// 31. Calculating the Power of a Number  
// Difficulty: Easy  
// Topics: Basic Programming, Mathematical Computations  
// Description: Write a program to calculate the power of a number.  
// Example:  
//     Input: `base = 2`, `exponent = 3`  
//     Output: `8`  
//     Explanation: 2 raised to the power of 3 is 8.

public class PowerCalculator {
    public static long calculatePower(int base,int exponent){
        long res=1;
        for(int i=1;i<=exponent;i++){
            res*=base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base=sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent=sc.nextInt();
        long res=calculatePower(base,exponent);
        System.out.print(base+" raised to the power of "+exponent+" is: "+res);
        sc.close();
    }
}
