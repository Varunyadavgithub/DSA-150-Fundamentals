import java.util.Scanner;

// 10: Checking if a Number is a Harshad (Niven) Number.
// Difficulty: Hard
// Topics: Number Theory, Mathematics
// Hint: A Harshad (Niven) number is a number that is divisible by the sum of its digits.
// Example 1:
//      Input: `n = 18`
//      Output: `18 is a Harshad (Niven) Number.`
// Explanation: Sum of digits = 1 + 8 = 9, and 18 is divisible by 9.

// Example 2:
//      Input: `n = 19`
//      Output: `19 is NOT a Harshad (Niven) Number.`
// Explanation: Sum of digits = 1 + 9 = 10, and 19 is not divisible by 10.

public class HarshadNumber {
    // Function to check if a number is a Harshad Number
    public static boolean isHarshad(int num) {
        int sumOfDigits = 0, temp = num;

        // Calculate the sum of digits
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        return num % sumOfDigits == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isHarshad(n)) {
            System.out.println(n + " is a Harshad (Niven) Number.");
        } else {
            System.out.println(n + " is NOT a Harshad (Niven) Number.");
        }
    }
}
