import java.util.Scanner;

// Class to convert temperature from Fahrenheit to Celsius
class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Formula: (°F − 32) x 5/9 = °C
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        input.close();
    }
}