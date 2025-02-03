package Hard;

import java.util.Scanner;

// 1: Print a Pascal’s Triangle.
// Difficulty: Medium  
// Topics: Matrix Pattern  
// Hint: Print Pascal’s Triangle up to `N` rows. Each row should be constructed based on the sum of the elements directly above it in the previous row.
// Example 1:
//     Input: `n = 4`  
//     Output:
//              1
//             1 1
//            1 2 1
//           1 3 3 1

public class PascalsTriangle {
    public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Compute next coefficient
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        scanner.close();

        printPascalsTriangle(n);
    }
}
