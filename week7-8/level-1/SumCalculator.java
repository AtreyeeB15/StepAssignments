import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        int totalSum = calculateNaturalSum(n);

        System.out.println("The sum of first " + n + " natural numbers is: " + totalSum);
    }

    public static int calculateNaturalSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}