// 30. Generating a Pattern of Prime Numbers.  
// Difficulty: Medium  
// Topics: Prime Numbers, Patterns  
// Description: Write a program to generate a pattern where each row contains the first few prime numbers.  
// Example:  
//     Input: `rows = 3`  
//     Output:
//     ```
//     2
//     2 3
//     2 3 5
//     ```

import java.util.Scanner;

public class PrimeNumberPattern {
    public static void generatePrimePattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            int primeInRow = 0;
            int currPrime = 2;
            while (primeInRow < i) {
                if (isPrime(currPrime)) {
                    System.out.print(currPrime + " ");
                    primeInRow++;
                }
                currPrime++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        generatePrimePattern(rows);
        sc.close();
    }
}
