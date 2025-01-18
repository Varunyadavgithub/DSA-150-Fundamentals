// 34. Finding All Triplets in an Array That Sum to Zero.
// Difficulty: Medium  
// Topics: Arrays, Sorting  
// Description: Write a program to find all unique triplets in an array that sum to zero.  
// Example:  
//     Input: `array = [-1, 0, 1, 2, -1, -4]`  
//     Output: `[[-1, -1, 2], [-1, 0, 1]]`  
//     Explanation: The unique triplets that sum to zero are listed.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TripletsWithZeroSum {
    public static List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left < right && arr[left] == arr[left + 1])
                        left++;
                    while (left < right && arr[right] == arr[right - 1])
                        right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        List<List<Integer>> triplets = findTriplets(array);
        System.out.println("Triplets that sum to zero: " + triplets);
        sc.close();
    }
}
