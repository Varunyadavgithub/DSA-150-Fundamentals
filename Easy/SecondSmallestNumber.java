package Easy;

import java.util.Scanner;

// 46. Finding the Second Smallest Number in an Array  
// Difficulty: Easy  
// Topics: Arrays  
// Description: Write a program to find the second smallest number in an array.  
// Example:  
//     Input: `array = [12, 13, 1, 10, 34, 1]`  
//     Output: `10`  
//     Explanation: The second smallest number in the array is 10.

public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
        }
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("The second smallest number is: " + secondSmallest);
        }
        sc.close();
    }
}
