package Easy;

// 58. Finding the Difference Between the Sum of Even and Odd Numbers in an Array
// Difficulty: Easy  
// Topics: Arrays, Mathematical Computations  
// Description: Write a program to calculate the difference between the sum of even and odd numbers in an array.  
// Example:  
//     Input: `array = [1, 2, 3, 4, 5, 6]`  
//     Output: `3`  
//     Explanation: The sum of even numbers is 12, and the sum of odd numbers is 9. The difference is 3.

import java.util.Scanner;

public class DifferenceEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Entre the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSum = 0, oddSum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Difference: " + diff);
        sc.close();
    }
}
