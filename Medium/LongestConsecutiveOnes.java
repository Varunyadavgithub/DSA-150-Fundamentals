// 25. Finding the Longest Sequence of Consecutive 1s in a Binary Array.  
// Difficulty: Medium  
// Topics: Arrays, Binary Operations  
// Description: Write a program to find the longest sequence of consecutive 1s in a binary array.  
// Example:  
//     Input: `array = [1, 1, 0, 1, 1, 1]`  
//     Output: `3`  
//     Explanation: The longest sequence of 1s is `[1, 1, 1]` with length 3.
public class LongestConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currCount = 0;
        for (int num : arr) {
            if (num == 1) {
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            } else {
                currCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int res = findMaxConsecutiveOnes(arr);
        System.out.print("The longest sequence of consecutive 1s is: " + res);
    }
}