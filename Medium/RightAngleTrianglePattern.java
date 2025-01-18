// 38: Print a Right-Angle Triangle Pattern with Characters.
// Difficulty: Medium  
// Topics: Pattern Printing  
// Hint: Print a right-angle triangle pattern using characters. Each row should contain the same character repeated according to the row number.
// Example:
//      Input: `n = 3`  
//      Output:
//              ```
//              A
//              BB
//              CCC
//              ```

import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void printCharacterTriangle(int n){
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (n): ");
        int n = sc.nextInt();
        printCharacterTriangle(n);
        sc.close();
    }
}
