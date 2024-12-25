package Easy;

// 63: Print an Inverted Triangle Pattern
// Difficulty: Easy  
// Topics: Pattern Printing  
// Hint: Print an inverted triangle pattern with stars (`*`). Each row should contain decreasing numbers of stars from the top row.
// Example 1:
//      Input: `n = 5`  
//      Output:
//          *****
//           ****
//            ***
//             **
//              *

import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
