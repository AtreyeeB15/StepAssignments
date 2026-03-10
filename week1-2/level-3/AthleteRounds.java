import java.util.Scanner;

// Class to calculate how many rounds of a triangular park equal 5km
class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetDistanceMeters = 5000;
        
        System.out.print("Enter side 1 (m): ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 (m): ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 (m): ");
        double side3 = input.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        double numberOfRounds = targetDistanceMeters / perimeter;
        
        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + 
                           " to complete 5 km");
        input.close();
    }
}