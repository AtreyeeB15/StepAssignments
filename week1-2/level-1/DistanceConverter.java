// Class to convert a fixed distance from km to miles
class DistanceConverter {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double kmToMilesConversionFactor = 1.6;
        
        // Calculate miles
        double miles = kilometers * kmToMilesConversionFactor;
        
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}