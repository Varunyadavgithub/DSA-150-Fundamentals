package Medium;

import java.util.Scanner;
import java.util.Arrays;
// 2. Finding the Median of an Array  
// Difficulty: Medium  
// Topics: Arrays, Sorting  
// Description: Write a program to find the median of an array of numbers.  
// Example:  
//     Input: `array = [3, 1, 2, 4, 5]`  
//     Output: `3`  
//     Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.

public class FindMedian {
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            // If the array has an even number of elements, return the average of the two middle elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }else{
            // If the array has an odd number of elements, return the middle element
            return arr[n/2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        double median = findMedian(arr);
        System.out.print("The median is: " + median);
        sc.close();
    }
}
