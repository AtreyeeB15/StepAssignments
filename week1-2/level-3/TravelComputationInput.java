import java.util.Scanner;

// Class to compute travel distance and time based on user input
class TravelComputationInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.print("From City: ");
        String fromCity = input.next();
        System.out.print("Via City: ");
        String viaCity = input.next();
        System.out.print("To City: ");
        String toCity = input.next();
        
        System.out.print("Distance from " + fromCity + " to " + viaCity + " (km): ");
        double fromToViaDist = input.nextDouble();
        System.out.print("Distance from " + viaCity + " to " + toCity + " (km): ");
        double viaToToDist = input.nextDouble();
        
        System.out.print("Time from " + fromCity + " to " + viaCity + " (mins): ");
        int timeFromToVia = input.nextInt();
        System.out.print("Time from " + viaCity + " to " + toCity + " (mins): ");
        int timeViaToTo = input.nextInt();
        
        // Results
        double totalDistance = fromToViaDist + viaToToDist;
        int totalTime = timeFromToVia + timeViaToTo;
        
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + 
                           " to " + toCity + " via " + viaCity + " is " + totalDistance + 
                           " km and the Total Time taken is " + totalTime + " minutes");
        input.close();
    }
}