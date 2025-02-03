package Hard;

import java.util.Scanner;

// 4: Print a Number Pyramid Pattern with Characters.
// Difficulty: Hard  
// Topics: Pattern Printing  
// Hint: Print a pyramid pattern using increasing characters, where each row increases in width and character range.
// Example 1:
//      Input: `n = 3`  
//      Output:
//              A
//             BCD
//            EFGHI

public class CharacterPyramid {
    public static void printCharacterPyramid(int n) {
        char ch = 'A'; // Initialize starting character

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for pyramid shape
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print characters in the current row
            int numChars = 2 * i - 1; // Number of characters in the row
            for (int j = 0; j < numChars; j++) {
                System.out.print(ch);
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

        printCharacterPyramid(n);
    }
}
