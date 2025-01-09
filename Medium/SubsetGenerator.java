// 21. Finding All Subsets of a Set.  
// Difficulty: Medium  
// Topics: Combinatorics  
// Description: Write a program to generate all possible subsets of a given set of numbers.  
// Example:  
//     Input: `set = [1, 2]`  
//     Output: `[[], [1], [2], [1, 2]]`  
//     Explanation: The subsets of [1, 2] are the empty set, [1], [2], and [1, 2].

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetGenerator {
    public static List<List<Integer>> generateSubsets(int[] set) {
        List<List<Integer>> res = new ArrayList<>();
        backtract(set, 0, new ArrayList<>(), res);
        return res;
    }

    public static void backtract(int[] set, int index, List<Integer> curr, List<List<Integer>> res) {
        if (index == set.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        backtract(set, index + 1, curr, res);
        curr.add(set[index]);
        backtract(set, index + 1, curr, res);
        curr.remove(curr.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the set: ");
        int n = sc.nextInt();
        int[] set = new int[n];
        System.out.print("Enter the elements of the set: ");
        for (int i = 0; i < n; i++) {
            set[i] = sc.nextInt();
        }
        List<List<Integer>> subsets = generateSubsets(set);
        System.out.print("All subsets: ");
        System.out.println(subsets);
        sc.close();
    }
}
