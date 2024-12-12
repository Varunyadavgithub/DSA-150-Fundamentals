package Easy;

import java.util.Scanner;

// 38. **Finding the Average of Numbers in an Array**  
//     **Difficulty**: Easy  
//     **Topics**: Arrays, Mathematical Computations  
//     **Description**: Write a program to calculate the average of numbers in an array.  
//     **Example**:  
//     Input: `array = [1, 2, 3, 4, 5]`  
//     Output: `3`  
//     Explanation: The average of the numbers is (1 + 2 + 3 + 4 + 5) / 5 = 3.

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int sum=0;
        System.out.print("Enter the "+size+" elements in array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avarage=(double) sum/size;
        System.out.print("The avarage of the numbers is: "+avarage);
        sc.close();
    }
}
