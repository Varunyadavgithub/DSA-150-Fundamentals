package Easy;

import java.util.Scanner;

// 24. Printing Prime Numbers Less Than a Given Number  
// Difficulty: Easy  
// Topics: Basic Programming, Number Theory  
// Description: Write a program to print all prime numbers less than a given number.  
// Example:  
//     Input: `number = 20`  
//     Output: `2, 3, 5, 7, 11, 13, 17, 19`  
//     Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.

public class PrimeNumbers {
    public static void printPrimes(int num){
        for(int i=2;i<num;i++){
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print("Prime numbers less than "+num+" are: ");
        printPrimes(num);
        sc.close();
    }
}
