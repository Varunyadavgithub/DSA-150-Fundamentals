// 31. Finding the Common Elements in Two Arrays.  
// Difficulty: Medium  
// Topics: Arrays  
// Description: Write a program to find common elements between two arrays.  
// Example:  
//     Input: `array1 = [1, 2, 3, 4]`, `array2 = [3, 4, 5, 6]`  
//     Output: `[3, 4]`  
//     Explanation: The common elements between the two arrays are 3 and 4.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {
    public static ArrayList<Integer> findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : arr1)
            set.add(num);
        for (int num : arr2) {
            if (set.contains(num)) {
                res.add(num);
                set.remove(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.print("Common Elements: " + commonElements);
        sc.close();
    }
}
