package Easy;

// 5. Generating the Fibonacci Series  
// Difficulty: Easy  
// Topics: Basic Programming, Sequences  
// Description: Write a program to generate the Fibonacci series up to a given number.  
// Example:  
//    Input: `limit = 10`  
//    Output: `[0, 1, 1, 2, 3, 5, 8]`  
//    Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].  

import java.util.*;;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit=sc.nextInt();

        int a=0; //The first number in the series
        int b=1; //The second number of the series

        System.out.print("Fibonacci series up to " + limit + ": " + a);

        if (limit>=1) {
            System.out.print(", "+b);
        }

        int nextTerm=a+b;
        while (nextTerm<=limit) {
            System.out.print(", "+nextTerm);
            a=b;
            b=nextTerm;
            nextTerm=a+b;
        }
        System.out.println();
        sc.close();
    }
}
