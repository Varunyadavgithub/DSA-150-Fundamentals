package Easy;

// 14. Finding the Largest and Smallest Numbers in an Array 
// Difficulty: Easy  
// Topics: Basic Programming, Arrays  
// Description: Write a program to find the largest and smallest numbers in an array.  
// Example:  
//     Input: `array = [4, 7, 1, 8, 5]`  
//     Output: `Largest: 8, Smallest: 1`  
//     Explanation: The largest number in the array is 8 and the smallest is 1.  

import java.util.*;

public class ArrayLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter " + size + " elements in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = findLargest(arr);
        int smallest = findSmallest(arr);
        System.out.print("The largest number in the array is " + largest + " and the smallest is " + smallest);
        sc.close();
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int findSmallest(int[] arr){
        int min=arr[0];
        for(int num:arr){
            if (num<min) {
                min=num;
            }
        }
        return min;
    }
}
