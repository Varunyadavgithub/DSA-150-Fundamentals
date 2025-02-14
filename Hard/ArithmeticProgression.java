import java.util.Scanner;

// 13: Finding the Nth Term in an Arithmetic Progression (AP).
// Difficulty: Hard
// Topics: Mathematics, Sequences  
// Hint: Use the formula for the Nth term of an AP: `a_n = a + (n - 1) * d`  
// Example 1:  
//      Input: `a = 2, d = 3, n = 5`  
//      Output: `Nth Term: 14`  
// Example 2:  
//      Input: `a = 5, d = 2, n = 10`  
//      Output: `Nth Term: 23`  

public class ArithmeticProgression {
    // Function to find the nth term of an AP
    public static int findNthTerm(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();
        System.out.print("Enter the term position (n): ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Nth Term: " + findNthTerm(a, d, n));
    }
}
