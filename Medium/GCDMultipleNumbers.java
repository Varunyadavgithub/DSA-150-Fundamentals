// 13. Finding the GCD of Multiple Numbers.
// Difficulty: Medium  
// Topics: Mathematical Computations  
// Description: Write a program to find the GCD (Greatest Common Divisor) of an array of numbers.  
// Example:  
//     Input: `array = [12, 24, 36]`  
//     Output: `12`  
//     Explanation: The GCD of 12, 24, and 36 is 12.

import java.util.Scanner;

public class GCDMultipleNumbers {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int findGCD(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = gcd(res, arr[i]);
            if (res == 1) {
                return 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int gcd = findGCD(arr);
        System.out.print("The GCD of the array is: " + gcd);
        sc.close();
    }
}
