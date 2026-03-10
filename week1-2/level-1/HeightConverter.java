import java.util.Scanner;

// Class to convert height from cm to feet and inches
class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        
        System.out.print("Enter your height in cm: ");
        double heightInCm = input.nextDouble();
        
        // Convert total cm to total inches
        double totalInches = heightInCm / cmPerInch;
        
        // Extract feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);
        double remainingInches = totalInches % inchesPerFoot;
        
        System.out.println("Your Height in cm is " + heightInCm + 
                           " while in feet is " + feet + " and inches is " + String.format("%.2f", remainingInches));
        input.close();
    }
}