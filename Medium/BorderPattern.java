// 40: Print a Border Pattern with Numbers.
// Difficulty: Medium  
// Topics: Matrix Pattern  
// Hint: Print a border pattern using numbers. The border should be filled with numbers, and the inner part should be empty.
// Example:
// Input: `n = 4`  
// Output:
//          ```
//          1234
//          1  1
//          1  1
//          1234
//          ```

import java.util.Scanner;

public class BorderPattern {
    public static void printBorderPattern(int n) {
        // Print the first row
        for (int j = 1; j <= n; j++) {
            System.out.print(j);
        }
        System.out.println();

        // Print the middle rows (if any)
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("1");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("1");
            System.out.println();
        }

        // Print the last row
        if (n > 1) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the border pattern (n): ");
        int n = sc.nextInt();
        printBorderPattern(n);
        sc.close();
    }
}
