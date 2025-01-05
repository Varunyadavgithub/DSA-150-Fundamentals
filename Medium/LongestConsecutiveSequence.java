// 19. Finding the Longest Consecutive Sequence in an Array.  
// Difficulty: Medium  
// Topics: Arrays, Hashing  
// Description: Write a program to find the longest sequence of consecutive numbers in an array.  
// Example:  
//     Input: `array = [100, 4, 200, 1, 3, 2]`  
//     Output: `4`  
//     Explanation: The longest consecutive sequence is [1, 2, 3, 4].

import java.util.Arrays;
// import java.util.HashSet;

public class LongestConsecutiveSequence {
    // Longest Consecutive Sequence Without using HashSet Data Structure.
    public static int findLongestConsecutiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int longestStreak = 1;
        int currStreak = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Skip duplicates
                if (nums[i] == nums[i - 1] + 1) {
                    currStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currStreak);
                    currStreak = 1;
                }
            }
        }
        return Math.max(longestStreak, currStreak);
    }

    // Longest Consecutive Sequence using HashSet Data Structure.
    // public static int findLongestConsecutiveSequence(int[] nums) {
    //     if (nums == null || nums.length == 0)
    //         return 0;
    //     HashSet<Integer> numSet = new HashSet<>();
    //     for (int num : nums) {
    //         numSet.add(num);
    //     }
    //     int longestStreak = 0;
    //     for (int num : nums) {
    //         if (!numSet.contains(num - 1)) {
    //             int currNum = num;
    //             int currStreak = 1;
    //             while (numSet.contains(currNum + 1)) {
    //                 currNum++;
    //                 currStreak++;
    //             }
    //             longestStreak = Math.max(longestStreak, currStreak);
    //         }
    //     }
    //     return longestStreak;
    // }

    public static void main(String[] args) {
        int[] array = { 100, 4, 200, 1, 3, 2 }; // Example input
        System.out.println("Longest consecutive sequence length: " + findLongestConsecutiveSequence(array));
    }
}
