import java.util.ArrayList;
import java.util.List;

// 1. Generating a Pascal’s Triangle  
// Difficulty: Medium  
// Topics: Arrays, Mathematical Computations  
// Description: Write a program to generate Pascal's Triangle up to a given number of rows.  
// Example:  
//     Input: `rows = 4`  
//     Output:
//              1
//              1 1
//              1 2 1
//              1 3 3 1
//     Explanation: Pascal's Triangle with 4 rows is generated.

import java.util.Scanner;

public class PascalsTriangle {
    public static List<List<Integer>> generatePascalsTriangle(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // First and last elements of each row are 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void printPascalsTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int rows = sc.nextInt();
        List<List<Integer>> triangle = generatePascalsTriangle(rows);
        printPascalsTriangle(triangle);
        sc.close();

        // Method - 2
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows for Pascal's triangle: ");
        // int rows = sc.nextInt();

        // // Generate and print Pascal's Triangle
        // for (int i = 0; i < rows; i++) {
        // int number = 1; // First number in a row is always 1
        // for (int j = 0; j <= i; j++) {
        // System.out.print(number + " ");
        // number = number * (i - j) / (j + 1);
        // }
        // System.out.println();
        // }
        // sc.close();
    }
}
