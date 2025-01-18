// 35: Print a Pattern of Alternating 0s and 1s.
// Difficulty: Medium  
// Topics: Matrix Pattern  
// Hint: Print a matrix where elements alternate between `0` and `1`. The pattern should alternate both row-wise and column-wise.
// Example:
//      Input: `n = 4`  
//      Output:
//              ```
//              0101
//              1010
//              0101
//              1010
//              ```

import java.util.Scanner;

public class AlternatingPattern {
    public static void generatePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt();
        generatePattern(n);
        sc.close();
    }
}
