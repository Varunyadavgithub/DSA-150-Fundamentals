package Easy;

// 65: Print a Pyramid Pattern with Numbers
// Difficulty: Easy  
// Topics: Pattern Printing  
// Hint: Print a pyramid pattern with increasing numbers. Each row should have an increasing sequence of numbers, centered horizontally.
// Example 1:
//      Input: `n = 3`  
//      Output:
//              1
//             232
//            34543

import java.util.Scanner;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Print space for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print increasing nunmbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            // Print decreasing numbers
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
        sc.close();
    }
}
