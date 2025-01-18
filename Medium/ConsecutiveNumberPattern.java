// 36: Print a Pattern of Consecutive Numbers.
// Difficulty: Medium  
// Topics: Matrix Pattern  
// Hint: Print a matrix of consecutive numbers starting from 1, filling rows sequentially.
// Example:
//      Input: `n = 3`  
//          Output:
//                  ```
//                  1 2 3
//                  4 5 6
//                  7 8 9
//                  ```

import java.util.Scanner;

public class ConsecutiveNumberPattern {
    public static void printConsecutivePattern(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt();
        printConsecutivePattern(n);
        sc.close();
    }
}
