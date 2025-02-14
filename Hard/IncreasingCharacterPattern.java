import java.util.Scanner;

// 7: Print a Pattern with Increasing Characters in Columns.
// Difficulty: Medium  
// Topics: Pattern Printing  
// Hint: Print a pattern where each column contains increasing characters from `A`.
// Example 1:
//      Input: `n = 3`  
//      Output:
//              A
//              B C
//              D E F

public class IncreasingCharacterPattern {
    public static void printPattern(int n) {
        char ch = 'A'; // Starting character

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns
                System.out.print(ch + " "); // Print the character
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printPattern(n);
    }
}
