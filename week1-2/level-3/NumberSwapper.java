import java.util.Scanner;

// Class to swap two numbers using a temporary variable
class NumberSwapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        
        // Swapping logic
        int temporary = number1;
        number1 = number2;
        number2 = temporary;
        
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        input.close();
    }
}