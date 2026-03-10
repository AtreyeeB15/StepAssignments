import java.util.Scanner;

// Class to find the side of a square given its perimeter
class SquareSideFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sidesOfSquare = 4;

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // side = perimeter / 4
        double side = perimeter / sidesOfSquare;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}