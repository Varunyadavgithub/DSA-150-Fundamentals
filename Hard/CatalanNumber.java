import java.math.BigInteger;

// 15: Finding the Nth Catalan Number.
// Difficulty: Hard  
// Topics: Combinatorics, Dynamic Programming, Recursion  
// Hint: The Nth Catalan number is given by the formula:  
//        C(n) = (2n)! / ((n+1)! * n!)  
//        Alternatively, it can be calculated using recursion or dynamic programming.  
// Example 1:  
//      Input: `n = 3`  
//      Output: `5`  
// Example 2:  
//      Input: `n = 4`  
//      Output: `14`  

import java.util.Scanner;

public class CatalanNumber {
    // Function to calculate factorial
    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Function to compute the nth Catalan number
    public static BigInteger catalan(int n) {
        BigInteger numerator = factorial(2 * n);
        BigInteger denominator = factorial(n + 1).multiply(factorial(n));
        return numerator.divide(denominator);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Catalan Number: " + catalan(n));
    }
}

/*
 * ### **Applications of Catalan Numbers**
 * 
 * Catalan numbers have numerous applications in combinatorics, mathematics, and
 * computer science. Some of the key applications include:
 * 
 * 1. **Counting Balanced Parentheses Combinations**
 * - The Catalan number \( C(n) \) represents the number of valid sequences of
 * `n` pairs of balanced parentheses.
 * - Example: `()()` and `(())` are two valid ways to balance 2 pairs of
 * parentheses.
 * 
 * 2. **Binary Search Trees (BSTs)**
 * - The number of distinct binary search trees that can be formed with `n`
 * nodes is given by the nth Catalan number.
 * - Example: With `n = 3`, there are **5** distinct BSTs.
 * 
 * 3. **Dyck Paths**
 * - A Dyck path is a staircase path from (0,0) to (n,n) that never goes below
 * the diagonal. The number of such paths is given by Catalan numbers.
 * 
 * 4. **Triangulation of a Polygon**
 * - The number of ways to divide a convex `(n+2)`-sided polygon into `n`
 * triangles using non-intersecting diagonals is given by the nth Catalan
 * number.
 * 
 * 5. **Parsing Expressions in Compiler Design**
 * - In compiler construction, Catalan numbers help count the number of valid
 * expressions generated by a grammar (e.g., arithmetic expressions without
 * ambiguity).
 * 
 * 6. **Full Binary Trees**
 * - The number of full binary trees (trees where every node has either 0 or 2
 * children) with `n` internal nodes is given by the Catalan number.
 * 
 * 7. **Handshakes in a Round Table**
 * - The number of ways `n` people sitting around a circular table can shake
 * hands without crossing their hands is given by Catalan numbers.
 * 
 * 8. **Stack Permutations**
 * - The number of valid permutations of `n` elements that can be produced using
 * a stack (push and pop operations) is given by Catalan numbers.
 * 
 * 9. **Convex Polygon Partitioning**
 * - The number of ways to completely divide an `n`-sided convex polygon into
 * triangles using non-crossing diagonals follows the Catalan sequence.
 * 
 * 10. **Applications in DNA Folding**
 * - Catalan numbers are used in bioinformatics to study RNA secondary
 * structures, where sequences fold into stable structures.
 * 
 * ### **Conclusion**
 * Catalan numbers appear in various fields, from **computer science and
 * mathematics to biology and physics**, making them one of the most important
 * sequences in combinatorial mathematics. 🚀
 */