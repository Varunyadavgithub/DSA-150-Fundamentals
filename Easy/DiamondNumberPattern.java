package Easy;

// 64: Print a Diamond Pattern with Numbers
// Difficulty: Easy  
// Topics: Pattern Printing  
// Hint: Print a diamond pattern with numbers. The pattern should have a peak in the middle with symmetric rows above and below it.
// Example 1:
//     Input: `n = 3`  
//     Output:
//             1
//            121
//           12321
//            121
//             1

import java.util.Scanner;

public class DiamondNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the number of rows: ");
        int n = sc.nextInt();

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
