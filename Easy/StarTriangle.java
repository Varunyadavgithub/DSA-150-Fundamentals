package Easy;

// 59. Generating a Triangle Pattern of Stars with a Given Height 
// Difficulty: Easy  
// Topics: Patterns  
// Description: Write a program to create a triangle pattern of stars with a specified height.  
// Example:  
//     Input: `height = 4`  
//     Output:
//     ```
//     *
//     **
//     ***
//     ****
//     ```

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int h = sc.nextInt();
        for (int i = 1; i <=h; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
