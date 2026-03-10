import java.util.Scanner;

// Class to calculate triangle area and convert between cm and inches
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cmToInch = 2.54;

        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Calculate area in sq cm: 1/2 * b * h
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert base and height to inches first for accurate sq in calculation
        double baseIn = baseCm / cmToInch;
        double heightIn = heightCm / cmToInch;
        double areaSqIn = 0.5 * baseIn * heightIn;

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + 
                           " and sq cm is " + areaSqCm);
        input.close();
    }
}