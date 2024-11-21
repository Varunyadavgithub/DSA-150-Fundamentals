package Easy;

// 16. Finding the Sum of Elements in an Array  
// Difficulty: Easy  
// Topics: Basic Programming, Arrays  
// Description: Write a program to find the sum of elements in an array.  
// Example:  
//     Input: `array = [1, 2, 3, 4, 5]`  
//     Output: `15`  
//     Explanation: The sum of the elements in the array is 15.  

import java.util.*;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = calculateSum(arr);
        System.out.print("The sum of element is: " + sum);
        sc.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
