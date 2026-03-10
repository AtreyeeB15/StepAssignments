import java.util.Scanner;

// Class to convert weight from pounds to kilograms
class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double conversionFactor = 2.2;
        
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        
        // Calculation: kg = pounds / 2.2
        double weightInKg = weightInPounds / conversionFactor;
        
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kg is " + weightInKg);
        input.close();
    }
}