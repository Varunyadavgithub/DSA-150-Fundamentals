// 18. Checking for a Balanced Bracket Sequence.  
// Difficulty: Medium  
// Topics: String Manipulation, Stack  
// Description: Write a program to check if a given string with brackets is balanced.  
// Example:  
//     Input: `string = "{[()]}"`  
//     Output: `True`  
//     Explanation: The brackets are balanced.

// import java.util.Stack;

public class BalancedBracketsChecker {
    // Balanced Brackets Checker Without using Stack Data Structure.
    public static boolean isBalanced(String str) {
        int round = 0, square = 0, curly = 0;
        for (char ch : str.toCharArray()) {
            // Increment counters for opening brackets
            if (ch == '(') {
                round++;
            } else if (ch == '[') {
                square++;
            } else if (ch == '{') {
                curly++;
            }
            // Decrement counters for closing brackets
            else if (ch == ')') {
                if (round == 0) {
                    return false; // Unmatch closing bracket
                }
                round--;
            } else if (ch == ']') {
                if (square == 0) {
                    return false; // Unmatch closing bracket
                }
                square--;
            } else if (ch == '}') {
                if (curly == 0) {
                    return false; // Unmatch closing bracket
                }
                curly--;
            }
        }
        // All counters should be zero for a balanced string
        return round == 0 && square == 0 && curly == 0;
    }

    // Balanced Brackets Checker using Stack Data Structure.
    // public static boolean isBalanced(String str) {
    //     Stack<Character> st = new Stack<>();
    //     for (char ch : str.toCharArray()) {
    //         if (ch == '(' || ch == '[' || ch == '{') {
    //             st.push(ch);
    //         } else if (ch == ')' || ch == ']' || ch == '}') {
    //             if (st.isEmpty())
    //                 return false;
    //             char top = st.pop();
    //             if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{'))
    //                 return false;
    //         }
    //     }
    //     return st.isEmpty();
    // }

    public static void main(String[] args) {
        String input = "{[()]}"; // Change this input to test other cases
        System.out.println("Is the string balanced? " + isBalanced(input));
    }
}
