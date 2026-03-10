// Class to calculate discount and final payable fee
class FeeDiscountCalculator {
    public static void main(String[] args) {
        double fee = 125000.0;
        double discountPercent = 10.0;
        
        // Calculations
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);
    }
}