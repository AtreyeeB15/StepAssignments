import java.util.Scanner;

// Class to take user input for km and convert to miles
class KiloToMileInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double conversionFactor = 1.6;
        
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        // Logic: miles = km / 1.6 (as per the hint 1 mile = 1.6km)
        double miles = km / conversionFactor;
        
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}