package Easy;

// 61: Print a Diamond Pattern
// Difficulty: Easy  
// Topics: Pattern Printing  
// Hint: Print a diamond pattern with stars (`*`). The pattern should include a single peak in the middle with symmetric rows above and below it.
// Example 1:
//      Input: `n = 3`  
//      Output:
//              *
//             ***
//            *****
//             ***
//              *

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the diamond: ");
        int n = sc.nextInt();

        // Upper half of the diamond (including the middle row)
        for (int i = 1; i <= n; i++) {
            // Print space before the stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Lower half of the diamond (excluding the middle row)
        for (int i = n - 1; i >= 1; i--) {
            // Print space before the stars
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
    }
}
