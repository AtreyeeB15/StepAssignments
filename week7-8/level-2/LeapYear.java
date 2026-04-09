import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Please enter a year from 1582 onwards.");
        } else {
            boolean isLeap = isLeapYear(year);
            System.out.println("Year " + year + (isLeap ? " is" : " is NOT") + " a Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Rule: Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}