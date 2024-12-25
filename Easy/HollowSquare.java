package Easy;

// 62: Print a Hollow Square of Stars
// Difficulty: Easy  
// Topics: Pattern Printing  
// Hint: Print a hollow square pattern with stars (`*`). The border of the square should be filled with stars while the inner part should be empty.
// Example 1:
//      Input: `n = 5`  
//      Output:
//          *****
//          *   *
//          *   *
//          *   *
//          *****

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of square: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
