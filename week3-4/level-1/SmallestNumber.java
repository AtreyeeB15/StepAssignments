import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input section
        System.out.println("Enter three numbers:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

       
        boolean isFirstLargest = (x >= y) && (x >= z);
        boolean isSecondLargest = (y >= x) && (y >= z);
        boolean isThirdLargest = (z >= x) && (z >= y);

        // Output section
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        
        input.close();
    }
}