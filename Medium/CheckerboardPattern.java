// 39: Print a Checkerboard Pattern.
// Difficulty: Medium  
// Topics: Matrix Pattern  
// Hint: Print a checkerboard pattern with two different characters alternating.
// Example:
//      Input: `n = 4`  
//      Output:
//              ```
//              XOXO
//              OXOX
//              XOXO
//              OXOX
//              ```

import java.util.Scanner;

public class CheckerboardPattern {
    public static void printCheckerboardPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the checkerboard (n): ");
        int n = sc.nextInt();
        printCheckerboardPattern(n);
        sc.close();
    }
}
