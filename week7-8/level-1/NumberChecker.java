import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int result = checkNumber(num);
        System.out.println("Result: " + result + " (1: Pos, -1: Neg, 0: Zero)");
    }

    public static int checkNumber(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }
}