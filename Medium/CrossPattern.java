// 42: Print a Cross Pattern with Stars.
// Difficulty: Medium  
// Topics: Pattern Printing  
// Hint: Print a cross pattern using stars. The cross should be centered within a matrix.
// Example:
//      Input: `n = 5`  
//      Output:
//              ```
//              *****
//                  *
//                  *
//                  *
//              *****
//              ```

import java.util.Scanner;

public class CrossPattern {
    public static void printCrossPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the cross pattern (n): ");
        int n = sc.nextInt();
        printCrossPattern(n);
        sc.close();
    }
}
