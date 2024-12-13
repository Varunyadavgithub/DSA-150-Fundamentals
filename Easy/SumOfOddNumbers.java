package Easy;

// 42. Finding the Sum of the First N Odd Numbers  
// Difficulty: Easy  
// Topics: Mathematical Computations  
// Description: Write a program to calculate the sum of the first N odd numbers.  
// Example:  
//    Input: `N = 5`  
//    Output: `25`  
//    Explanation: Sum of the first 5 odd numbers (1 + 3 + 5 + 7 + 9) is 25.

import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1,count=0;count<n;i+=2){
            sum+=i;
            count++;
        }
        System.out.println("Sum of the first "+n+" odd numbers is: "+sum);
        sc.close();
    }
}
