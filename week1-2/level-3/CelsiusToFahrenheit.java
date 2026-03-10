import java.util.Scanner;

// Class to convert temperature from Celsius to Fahrenheit
class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Formula: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        input.close();
    }
}