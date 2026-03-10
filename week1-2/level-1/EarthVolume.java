// Class to compute the volume of Earth in cubic km and cubic miles
class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double kmToMilesFactor = 0.621371;
        double pi = Math.PI;
        
        // Volume in km^3: (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        
        // Convert radius to miles first for accurate cubic conversion
        double radiusMiles = radiusKm * kmToMilesFactor;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}