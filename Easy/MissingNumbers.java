package Easy;

import java.util.*;

// 30. Finding Missing Numbers in a Sequence  
// Difficulty: Easy  
// Topics: Basic Programming, Arrays  
// Description: Write a program to find missing numbers in a sequence from 1 to n.  
// Example:  
//     Input: `sequence = [1, 2, 4, 5]`  
//     Output: `[3]`  
//     Explanation: The missing number in the sequence from 1 to 5 is 3.

public class MissingNumbers {
    public static List<Integer> findMissingNumbers(int[] sequence, int n) {
        boolean[] present = new boolean[n + 1];

        // Mark numbers present in the sequence
        for (int num : sequence) {
            if (num <= n) {
                present[num] = true;
            }
        }

        // Collect missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of sequence: ");
        int size = sc.nextInt();
        System.out.print("Enter the number in sequence: ");
        int[] sequence = new int[size];
        for (int i = 0; i < size; i++) {
            sequence[i] = sc.nextInt();
        }
        List<Integer> missingNumbers = findMissingNumbers(sequence, size);
        System.out.println("Missing numbers: " + missingNumbers);

        sc.close();
    }
}