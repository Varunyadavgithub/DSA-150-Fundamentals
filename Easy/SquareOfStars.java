package Easy;

// 60: Print a Square of Stars
// Difficulty: Easy  
// Topics: Pattern Printing  
// Hint: Print a square pattern of stars (`*`). Each row and column should have the same number of stars.
// Example 1:
//      Input: `n = 5`  
//      Output:
//          *****
//          *****
//          *****
//          *****
//          *****

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
