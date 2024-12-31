// 11. Finding All Pairs of Elements in an Array that Add Up to a Given Sum.
// Difficulty: Medium  
// Topics: Arrays
// Description: Write a program to find all pairs of elements in an array whose sum equals a specified target.  
// Example:  
//     Input: `array = [1, 2, 3, 4, 5]`, `target = 5`  
//     Output: `[(1, 4), (2, 3)]`  
//     Explanation: Pairs that sum up to 5 are (1, 4) and (2, 3).

import java.util.Scanner;

public class FindPairsWithSum {
    public static void findPairs(int[] arr,int target){
        System.out.print("Pairs with sum: "+target+" :");
        boolean found=false;
        // Iterayte through the array to find pairs
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target) {
                    System.out.print("("+arr[i]+", "+arr[j]+")");
                    found=true;
                }
            }
        }
        if (!found) {
            System.out.print("No pairs found.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target=sc.nextInt();
        findPairs(arr,target);
        sc.close();
    }
}
