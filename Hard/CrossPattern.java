import java.util.Scanner;

// 6: Print a Cross Pattern of Stars with Diagonals.
// Difficulty: Hard  
// Topics: Pattern Printing  
// Hint: Print a cross pattern using stars with intersecting diagonals.
// Example 1:
//      Input: `n = 5`  
//      Output:
//              * * * * *
//               * * * *
//                * * *
//                 * *
//                  *
//                 * *
//                * * *
//               * * * *
//              * * * * *

public class CrossPattern {
    public static void printCrossPattern(int n) {
        // Upper half of the pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next row
        }

        // Lower half of the pattern
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printCrossPattern(n);
    }
}
