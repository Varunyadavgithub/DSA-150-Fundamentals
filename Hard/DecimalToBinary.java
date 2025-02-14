import java.util.Scanner;

// 11: Converting a Decimal Number to Binary.
// Difficulty: Hard
// Topics: Number Conversion, Bitwise Operations
// Hint: Convert a given decimal number into its binary representation using division by 2.
// Example 1:
//      Input: `n = 10`
//      Output: `Binary: 1010`
// Explanation: 10 in decimal is 1010 in binary.
//
// Example 2:
//      Input: `n = 7`
//      Output: `Binary: 111`
// Explanation: 7 in decimal is 111 in binary.


public class DecimalToBinary {
    // Function to convert decimal to binary
    public static String convertToBinary(int num) {
        if (num == 0)
            return "0";

        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }

        return binary.reverse().toString(); // Reverse the string to get correct order
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Binary: " + convertToBinary(n));
    }
}
