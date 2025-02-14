import java.util.Scanner;

// 14: Finding the Nth Term in a Geometric Progression (GP).  
// Difficulty: Hard 
// Topics: Mathematics, Sequences  
// Hint: Use the formula for the Nth term of a GP: `a_n = a * r^(n-1)`  
// Example 1:  
//      Input: `a = 2, r = 3, n = 5`  
//      Output: `Nth Term: 162`  
// Example 2:  
//      Input: `a = 5, r = 2, n = 4`  
//      Output: `Nth Term: 40`  

public class GeometricProgression {
    // Function to find the nth term of a GP
    public static double findNthTerm(int a, int r, int n) {
        return a * Math.pow(r, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the common ratio (r): ");
        int r = scanner.nextInt();
        System.out.print("Enter the term position (n): ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Nth Term: " + (int) findNthTerm(a, r, n));
    }
}
