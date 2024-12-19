package Easy;

// 50. Generating a Right-Angle Triangle Pattern of Numbers
// Difficulty: Easy  
// Topics: Patterns  
// Description: Write a program to create a right-angle triangle pattern with numbers.  
// Example:  
//     Input: `height = 4`  
//     Output:  
//     ```
//     1  
//     12  
//     123  
//     1234  

import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of triamgle: ");
        int height=sc.nextInt();
        for(int i=1;i<=height;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
