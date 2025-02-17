import java.util.Scanner;

// 18: Finding the Sum of First N Terms in a Geometric Series.
// Difficulty: Hard
// Topics: Mathematics, Geometric Progression
// Hint: The sum of the first `N` terms of a geometric series is given by:
//        S_n = a * (1 - r^n) / (1 - r), if r ≠ 1
//        Where:
//        - `S_n` = Sum of first `N` terms
//        - `a` = First term
//        - `r` = Common ratio
//        - `n` = Number of terms
// Example 1:
//      Input: `n = 5, a = 2, r = 3`
//      Output: `Sum = 242`
// Example 2:
//      Input: `n = 4, a = 1, r = 2`
//      Output: `Sum = 15`

public class GeometricSeriesSum {
    public static double sumOfGeometricSeries(int n, int a, int r) {
        if (r == 1) {
            return n * a; // If r = 1, it's just a repeated sum
        }
        return a * (1 - Math.pow(r, n)) / (1 - r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the common ratio (r): ");
        int r = scanner.nextInt();
        scanner.close();

        double sum = sumOfGeometricSeries(n, a, r);
        System.out.println("Sum of the first " + n + " terms: " + (long) sum);
    }
}
