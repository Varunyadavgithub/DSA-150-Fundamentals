// 28. Finding the Median of a List of Numbers.  
// Difficulty: Medium  
// Topics: Sorting, Mathematical Computations  
// Description: Write a program to find the median value of a list of numbers.  
// Example:  
//     Input: `list = [3, 1, 4, 1, 5]`  
//     Output: `3`  
//     Explanation: After sorting the list to [1, 1, 3, 4, 5], the median is 3.

import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {
    public static double findMedian(int[] list) {
        Arrays.sort(list);
        int n = list.length;
        if (n % 2 == 0) {
            return (list[n / 2 - 1] + list[n / 2]) / 2.0;
        } else {
            return list[n / 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] list = new int[n];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        double median = findMedian(list);
        System.out.println("Median: " + median);
        sc.close();
    }
}
