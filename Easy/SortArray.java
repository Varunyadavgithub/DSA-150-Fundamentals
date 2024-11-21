package Easy;

// 15. Sorting an Array  
// Difficulty: Easy  
// Topics: Basic Programming, Sorting Algorithms  
// Description: Write a program to sort an array of numbers in ascending order.  
// Example:  
//     Input: `array = [3, 1, 4, 1, 5, 9]`  
//     Output: `[1, 1, 3, 4, 5, 9]`  
//     Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].  

import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The sorted array is: "+Arrays.toString(arr));
        sc.close();
    }
}
