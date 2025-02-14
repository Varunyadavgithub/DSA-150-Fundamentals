import java.util.Scanner;

// 5: Print a Pattern with Diagonal Lines.
// Difficulty: Hard  
// Topics: Pattern Printing  
// Hint: Print a pattern with diagonal lines using characters. Each diagonal line should be aligned properly.
// Example 1:
//      Input: `n = 4`  
//      Output:
//              A
//              B B
//              C   C
//              D     D

public class DiagonalPattern {
    public static void printDiagonalPattern(int n) {
        char ch = 'A'; // Start with 'A'

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == i) {
                    System.out.print(ch); // Print character on diagonals
                } else {
                    System.out.print(" "); // Print space elsewhere
                }
            }
            ch++; // Move to the next character for the next row
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printDiagonalPattern(n);
    }
}
