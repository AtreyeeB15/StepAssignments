import java.util.Scanner;

// Class to calculate Simple Interest based on P, R, and T
class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time: ");
        double time = input.nextInt();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + 
                           principal + ", Rate of Interest " + rate + " and Time " + time);
        input.close();
    }
}