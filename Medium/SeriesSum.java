// 10. Calculating the Sum of a Series (1 + 1/2 + 1/3 + ... + 1/n).
// Difficulty: Medium  
// Topics: Mathematical Computations  
// Description: Write a program to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n up to the nth term.  
// Example:  
//     Input: `n = 4`  
//     Output: `2.083333`  
//     Explanation: Sum of the series is 1 + 1/2 + 1/3 + 1/4 ≈ 2.083333.

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num=sc.nextInt();
        double sum=0.0;
        for(int i=1;i<=num;i++){
            sum+=1.0/i;
        }
        System.out.printf("The sum of the series is: %.6f\n",sum);
        sc.close();
    }
}
