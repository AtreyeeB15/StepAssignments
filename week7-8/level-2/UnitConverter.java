import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in Kilometers: ");
        double km = input.nextDouble();
        System.out.println(km + " km is " + convertKmToMiles(km) + " miles.");

        System.out.print("Enter distance in Meters: ");
        double meters = input.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
    }

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
}