package Easy;

// 17. Checking for Armstrong Numbers in a Range  
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to find all Armstrong numbers within a given range.  
// Example: 
//     Input: `range = [1, 500]`  
//     Output: `[1, 153, 370, 371, 407]`  
//     Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.  

import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int end = sc.nextInt();
        System.out.print("Armstrong numbers between " + start + " and " + end + ": ");
        for (int i = start; i < end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int org = num;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == org;
    }
}
