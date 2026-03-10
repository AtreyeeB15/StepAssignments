import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary and years for employee " + (i + 1) + ": ");
            double s = input.nextDouble();
            double y = input.nextDouble();
            
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }
            salaries[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        input.close();
    }
}