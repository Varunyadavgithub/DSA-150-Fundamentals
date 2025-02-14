import java.util.Scanner;

// 3: Print a Pattern of Alternating Characters in Rows.
// Difficulty: Hard  
// Topics: Pattern Printing  
// Hint: Print a pattern where rows alternate between two characters.
// Example 1:
//      Input: `n = 4`  
//      Output:
//          ABAB
//          BABA
//          ABAB
//          BABA

public class AlternatingPattern {
    public static void printAlternatingPattern(int n) {
        for (int i = 0; i < n; i++) {
            char startChar = (i % 2 == 0) ? 'A' : 'B';
            for (int j = 0; j < n; j++) {
                System.out.print(startChar);
                startChar = (startChar == 'A') ? 'B' : 'A'; // Toggle between A and B
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printAlternatingPattern(n);
    }
}
