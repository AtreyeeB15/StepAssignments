import java.util.Scanner;

// Class to convert distance in feet to yards and miles
class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int feetInYard = 3;
        int yardsInMile = 1760;

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Calculations
        double distanceInYards = distanceInFeet / feetInYard;
        double distanceInMiles = distanceInYards / yardsInMile;

        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);
        input.close();
    }
}