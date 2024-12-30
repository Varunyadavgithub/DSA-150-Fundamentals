// 8. Finding the Second Largest Number in an Array.
// Difficulty: Medium  
// Topics: Arrays, Sorting  
// Description: Write a program to find the second largest number in an array.  
// Example:  
//     Input: `array = [10, 20, 4, 45, 99]`  
//     Output: `45`  
//     Explanation: The second largest number in the array is 45.

import java.util.Scanner;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.print("Array must have at least two elements.");
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.print("There is no second largest element: ");
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.print("Array must have at least two elements.");
        }
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int secondLargest = findSecondLargest(arr);
        if (secondLargest != -1) {
            System.out.print("The second largest number in the array is: " + secondLargest);
        }
        sc.close();
    }
}
