package Easy;

import java.util.Scanner;

// 3. Validating Leap Years  
// Difficulty: Easy  
// Topics: Basic Programming, Date Handling  
// Description: Write a program to check if a given year is a leap year.  
// Example:  
//    Input: `year = 2020`  
//    Output: `Leap Year`  
//    Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year. 

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year:");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.print(year + " is a leap year");
        } else {
            System.out.print(year + "is not a leap year");
        }
        sc.close();
    }
}
