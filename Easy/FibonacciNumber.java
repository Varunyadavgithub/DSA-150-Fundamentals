package Easy;

import java.util.Scanner;

// 23. Finding the Fibonacci Number at a Specific Position  
// Difficulty: Easy  
// Topics: Basic Programming, Sequences  
// Description: Write a program to find the Fibonacci number at a specific position.  
// Example:  
//     Input: `position = 5`  
//     Output: `5`  
//     Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).

public class FibonacciNumber {
    static int findFibonacci(int position) {
        if (position == 0) {
            return 0;
        }
        if (position == 1) {
            return 1;
        }
        int prev1 = 1, prev2 = 0;
        int current = 0;
        for (int i = 2; i <= position; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int position = sc.nextInt();
        int result = findFibonacci(position);
        System.out.println("Fibonacci number at position " + position + " is: " + result);
        sc.close();
    }
}
