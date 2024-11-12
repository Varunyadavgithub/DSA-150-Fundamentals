package Easy;

// 7. Crafting Star Patterns  
// Difficulty: Easy  
// Topics: Basic Programming, Patterns  
// Description: Write a program to create different star patterns (e.g., pyramid, diamond).  
// Example:  
//    Input: `patternType = "pyramid", height = 5`  
//    Output:  
//    ```
//        *
//       ***
//      *****
//     *******
//    *********
//    ```  
//    Explanation: A pyramid pattern with a height of 5 is generated.

import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
