import java.util.Scanner;

// 8: Print a Matrix with Zigzag Pattern of Stars.
// Difficulty: Medium  
// Topics: Pattern Printing  
// Hint: Print a matrix where stars form a zigzag pattern, alternating rows in their positioning.
// Example 1:
//      Input: `n = 3`  
//      Output:
//          * * *
//           * *
//          * * *

public class ZigzagStarMatrix {
    public static void printZigzagMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print spaces for alignment in zigzag pattern
                if (i % 2 == 1 && j == 0) {
                    System.out.print(" ");
                }
                if (i % 2 == 1 && j == n - 1) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printZigzagMatrix(n);
    }
}
