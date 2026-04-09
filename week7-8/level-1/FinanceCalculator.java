import java.util.Scanner;

public class FinanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = input.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
    }

    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}