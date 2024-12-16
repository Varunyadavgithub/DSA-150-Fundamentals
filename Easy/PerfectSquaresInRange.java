package Easy;

// 44. Checking for Perfect Squares in a Range  
// Difficulty: Easy  
// Topics: Mathematical Computations  
// Description: Write a program to check which numbers in a given range are perfect squares.  
// Example:  
//     Input: `start = 1`, `end = 10`  
//     Output: `[1, 4, 9]`  
//     Explanation: Perfect squares between 1 and 10 are 1, 4, and 9.

import java.util.ArrayList;
import java.util.Scanner;
public class PerfectSquaresInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start=sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end=sc.nextInt();
        ArrayList<Integer> perfectSquares=new ArrayList<>();
        for(int i=(int)Math.ceil(Math.sqrt(start));i<=Math.floor(Math.sqrt(end));i++){
            perfectSquares.add(i*i);
        }
        System.out.print("Perfect squares in the range [" + start + ", " + end + "]: " + perfectSquares);
        sc.close();
    }
}
