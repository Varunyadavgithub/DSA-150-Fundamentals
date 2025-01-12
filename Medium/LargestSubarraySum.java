// 23. Finding the Largest Sum of a Subarray.
// Difficulty: Medium  
// Topics: Arrays, Dynamic Programming  
// Description: Write a program to find the largest sum of any contiguous subarray.  
// Example:  
//     Input: `array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`  
//     Output: `6`  
//     Explanation: The largest sum is 6, from the subarray `[4, -1, 2, 1]`.

public class LargestSubarraySum {
    public static int findLargestSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int num : arr) {
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = findLargestSum(array);
        System.out.print("The largest sum of a contiguous subarray is: " + result);
    }
}
