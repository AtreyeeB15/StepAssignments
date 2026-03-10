import java.util.Scanner;

// Class to calculate discount based on user input for fee and rate
class StudentDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter University Fee: ");
        double fee = input.nextDouble();
        
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculations
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);
        input.close();
    }
}