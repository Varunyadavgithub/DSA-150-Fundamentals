// 37: Print a Star Pattern with Increasing Width.
// Difficulty: Medium  
// Topics: Pattern Printing  
// Hint: Print a pattern where each row has an increasing width of stars.
// Example:
//      Input: `n = 3`  
//      Output:
//              ```
//              *
//              ***
//              *****
//              ```

import java.util.Scanner;

public class StarPatternIncreasingWidth {
    public static void printStarPattern(int n) {
        int stars = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (n): ");
        int n = sc.nextInt();
        printStarPattern(n);
        sc.close();
    }
}
