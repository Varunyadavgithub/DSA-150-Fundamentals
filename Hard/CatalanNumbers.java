import java.util.Scanner;
import java.math.BigInteger;

// 16: Print the First N Catalan Numbers.
// Difficulty: Hard 
// Topics: Combinatorics, Dynamic Programming  
// Hint: Catalan numbers can be computed using the recurrence relation:  
//        C(n) = Σ C(i) * C(n-i-1)  (for i = 0 to n-1)  
//        Alternatively, the formula is:  
//        C(n) = (2n)! / ((n+1)! * n!)  
// Example 1:  
//      Input: `n = 5`  
//      Output: `1 1 2 5 14`  
// Example 2:  
//      Input: `n = 10`  
//      Output: `1 1 2 5 14 42 132 429 1430 4862`  

public class CatalanNumbers {
    // Function to compute the first n Catalan numbers without DP
    public static void printCatalanNumbers(int n) {
        BigInteger catalan = BigInteger.ONE;
        System.out.print(catalan + " "); // C(0) = 1

        for (int i = 1; i < n; i++) {
            catalan = catalan.multiply(BigInteger.valueOf(2 * (2 * i - 1)))
                    .divide(BigInteger.valueOf(i + 1));
            System.out.print(catalan + " ");
        }
        System.out.println(); // For cleaner output
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Catalan numbers to print: ");
        int n = scanner.nextInt();
        scanner.close();

        printCatalanNumbers(n);
    }
}
