import java.util.Scanner;

// Class to compute total income by adding salary and bonus
class IncomeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter Bonus: ");
        double bonus = input.nextDouble();
        
        // Compute total income
        double totalIncome = salary + bonus;
        
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);
        input.close();
    }
}