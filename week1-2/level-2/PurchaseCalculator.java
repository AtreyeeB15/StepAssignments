import java.util.Scanner;

// Class to calculate total price based on unit price and quantity
class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price of the item: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Total Price = price * quantity
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}