// 6. Finding the Mode of Numbers in an Array.  
// Difficulty: Medium  
// Topics: Arrays, Statistical Analysis  
// Description: Write a program to find the mode (most frequent number) in an array.  
// Example:  
//     Input: `array = [1, 2, 2, 3, 4, 4, 4]`  
//     Output: `4`  
//     Explanation: The most frequent number in the array is 4.

import java.util.Scanner;

public class ModeOfArray {
    public static int findMode(int[] arr) {
        int maxCount = 0;
        int mode = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // Count how many times array[i] appears
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mode = findMode(arr);
        System.out.println("The mode of an array is: " + mode);
        sc.close();
    }
}
