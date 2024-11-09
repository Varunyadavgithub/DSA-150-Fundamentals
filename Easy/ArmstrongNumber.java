package Easy;

// 4 Calculating Armstrong Numbers
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to check if a number is an Armstrong number.  
// Example:  
//    Input: `number = 153`  
//    Output: `Armstrong Number`  
//    Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.  

import java.util.*;
public class ArmstrongNumber {
    public static boolean isArmstrong(int num){
        int originalNum=num;
        int sum=0;
        int numberofDigits=String.valueOf(num).length();

        while (num>0) {
            int digit=num%10; //extract the last (rightmost) digit of a number.
            sum+=Math.pow(digit, numberofDigits);
            num/=10; //removes the last (rightmost) digit of the number.
        }
        return sum==originalNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
        sc.close();
    }
}
