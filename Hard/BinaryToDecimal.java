import java.util.Scanner;

// 12: Converting a Binary Number to Decimal.
// Difficulty: Hard
// Topics: Number Conversion, Bitwise Operations
// Hint: Convert a given binary number into its decimal equivalent using place value method.
// Example 1:
//      Input: `binary = 1010`
//      Output: `Decimal: 10`
// Explanation: (1×2³) + (0×2²) + (1×2¹) + (0×2⁰) = 10
//
// Example 2:
//      Input: `binary = 111`
//      Output: `Decimal: 7`
// Explanation: (1×2²) + (1×2¹) + (1×2⁰) = 7


public class BinaryToDecimal {
    // Function to convert binary to decimal
    public static int convertToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        scanner.close();

        System.out.println("Decimal: " + convertToDecimal(binary));
    }
}
