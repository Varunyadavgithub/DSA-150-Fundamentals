import java.util.Scanner;

// 17: Find the Sum of First N Terms in an Arithmetic Series.
// Difficulty: Hard
// Topics: Mathematics, Arithmetic Progression
// Hint: The sum of the first `N` terms of an arithmetic series is given by:
//        S_n = (n/2) * (2a + (n-1) * d)
//        Where:
//        - `S_n` = Sum of first `N` terms
//        - `a` = First term
//        - `d` = Common difference
//        - `n` = Number of terms
// Example 1:
//      Input: `n = 5, a = 2, d = 3`
//      Output: `Sum = 40`
// Example 2:
//      Input: `n = 10, a = 1, d = 2`
//      Output: `Sum = 100`

public class ArithmeticSeriesSum {
    // Function to compute the sum of first N terms in an arithmetic series
    public static int sumOfArithmeticSeries(int n, int a, int d) {
        return (n * (2 * a + (n - 1) * d)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();
        scanner.close();

        int sum = sumOfArithmeticSeries(n, a, d);
        System.out.println("Sum of the first " + n + " terms: " + sum);
    }
}
