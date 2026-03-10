import java.util.Scanner;

// Class to find quotient and remainder of two numbers
class DivisionDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (Dividend): ");
        int number1 = input.nextInt();
        System.out.print("Enter second number (Divisor): ");
        int number2 = input.nextInt();

        // Operations
        int quotient = number1 / number2;
        int reminder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + 
                           " of two numbers " + number1 + " and " + number2);
        input.close();
    }
}