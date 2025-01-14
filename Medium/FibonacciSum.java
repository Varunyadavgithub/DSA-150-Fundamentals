// 26. Calculating the Sum of the First N Fibonacci Numbers.  
// Difficulty: Medium  
// Topics: Fibonacci Sequence, Mathematical Computations  
// Description: Write a program to calculate the sum of the first N Fibonacci numbers.  
// Example:  
//     Input: `N = 5`  
//     Output: `12`  
//     Explanation: The first 5 Fibonacci numbers are 1, 1, 2, 3, 5, and their sum is 12.

import java.util.Scanner;
public class FibonacciSum {
    public static int calculateFibonacciSum(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        int a = 1;
        int b = 1;
        int sum = a + b;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int result = calculateFibonacciSum(N);
        System.out.print("The sum of the first " + N + " Fibonacci numbers is: " + result);
        sc.close();
    }
}
