import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int totalHandshakes = findMaxHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes is: " + totalHandshakes);
    }

    public static int findMaxHandshakes(int n) {
        // Formula: (n * (n - 1)) / 2
        return (n * (n - 1)) / 2;
    }
}