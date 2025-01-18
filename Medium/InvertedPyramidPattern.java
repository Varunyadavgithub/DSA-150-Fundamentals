// 41: Print an Inverted Pyramid Pattern with Characters.
// Difficulty: Medium  
// Topics: Pattern Printing  
// Hint: Print an inverted pyramid pattern using characters. Each row should have decreasing characters from the top row.
// Example:
//      Input: `n = 3`  
//      Output:
//              ```
//              CCC
//               BB
//                A
//              ```

import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void printInvertedPyramid(int n) {
        char ch;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            ch = (char) ('A' + (n - 1 - i));
            for (int j = 0; j < n - i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the inverted pyramid (n): ");
        int n = sc.nextInt();
        printInvertedPyramid(n);
        sc.close();
    }
}
